package cevap1;

public interface List <T> extends Iterable<T>{
	
	public void listAddFirst(T t);
	public void sizePrint() ;
	public void listRemoveFirst(T t);
	public void lastAddList(T t);
	public void lastRemoveList();

}
