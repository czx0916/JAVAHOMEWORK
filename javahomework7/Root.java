package javaHomework;

public class Root {

	public static void main(String[] args) {
		    Device device = new Device();
	        Sensor heat = new Sensor(device);
	        Sensor pressure = new Sensor(device);

	        Controller controller = new Controller(device,heat,pressure);

	        controller.start();
	        heat.start();
	        pressure.start();
	}
}
class Device{
	public void startup(){
		System.out.println("the device is starting");
	}
	public void shutdown(){
		System.out.println("the device is shutting down and exit");
	}
}
class Sensor extends Thread {
    private final Device device;
    private double value;
    public Sensor(Device device) {
        this.device = device;
    }
    public double getValue() {
        return value;
    }
    public void updateValue(int num) { 
        this.value += num; // you check with other values here and see how it works
    }
    public void run() { 
//    	while(true)
//    		{
//    		value+=5;
//    		System.out.println(value);
//    		}
    }
}
class Controller extends Thread{
	private Device device;
	private Sensor heat;
	private Sensor pressure;
	public Controller(Device device,Sensor heat,Sensor pressure){
	this.device = device;
	this.heat = heat;
	this.pressure = pressure;
	}
	public void run(){
		device.startup();
		while(true){
		heat.updateValue((int)(Math.random()*10));
		pressure.updateValue((int)(Math.random()*10));
		System.out.println("heat -> " +heat.getValue()+" pressure -> "+pressure.getValue());
		if(heat.getValue()>70)
			{
			heat.interrupt();
			break;
			}
		if(pressure.getValue()>100){
			pressure.interrupt();
			break;
		}
		}
		device.shutdown();
	}
}