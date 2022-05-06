package generic;

public class Holder<T> 
{
	private T ref;
	
	public Holder(T ref)
	{
		this.ref=ref;
	}
	
	public T getref()
	{
		return ref;
	}

}
