package Kodlamaio.Hrms.Core.Utilities.Results;

public class SuccessResult extends Result{
	public SuccessResult(boolean success) {
		super(true);
	}

	public SuccessResult(boolean success, String message) {
		super(true, message);
	}
	
	public SuccessResult(String message) {
		super(message);
	}

}
