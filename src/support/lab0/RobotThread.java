package support.lab0;


import lab0.RobotInstructions;

public class RobotThread extends Thread {
	
	final private RobotMotionAdapter motion;
	final private RobotInstructions instr;
	public RobotThread(RobotMotionAdapter r, RobotInstructions instr) {
		this.motion = r;
		this.instr = instr;
	}
	
	public void run() {
		instr.act(motion);
	}

}
