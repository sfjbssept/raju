package demo.com.cumpitable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		 Future<?> stringFuture = executor.submit(() -> neverEndingComputation());
		 System.out.println("The result is: " + stringFuture.get());

	}

	private static Object neverEndingComputation() {
		// TODO Auto-generated method stub
		return null;
	}

}
