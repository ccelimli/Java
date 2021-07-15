package Kodlamaio.Hrms.Core.Utilities.Results;

public class ErrorResult extends Result{

	public ErrorResult(boolean success) {
		super(success);
		
	}
	public ErrorResult(String message) {
		super(false,message);
	}

}
