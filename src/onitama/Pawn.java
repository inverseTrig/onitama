package onitama;

public class Pawn {
	
	private boolean isRed;
	private boolean isMaster;
	
	public Pawn(boolean isRed, boolean isMaster) {
		this.isRed = isRed;
		this.isMaster = isMaster;
	}

	public boolean isRed() {
		return isRed;
	}

	public void setRed(boolean isRed) {
		this.isRed = isRed;
	}

	public boolean isMaster() {
		return isMaster;
	}

	public void setMaster(boolean isMaster) {
		this.isMaster = isMaster;
	}
	
}
