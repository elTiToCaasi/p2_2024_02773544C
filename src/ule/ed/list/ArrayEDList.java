package ule.ed.list;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayEDList<T> implements IEDList<T> {
	static final int DEFAULT_CAPACITY=10;

    private T[] data;
	private int count;
	
	// NO SE PUEDEN AÑADIR MÁS ATRIBUTOS A LA LISTA IMPLEMENTADA CON ARRAYS

	

	private class ArrayEDListIterator<T> implements Iterator<T> {
		private int current=0;

		@Override
		private void expandCapacity(){
		T[]larger=(T[])(new Object[data.lenght*2]);
		for(int i=0;i<contens.lenght;i++){
		larger [i]=data[i];
		data=larger;
		}


	}





		@Override
		public boolean hasNext() {
		boolean hasnext=false;
		if (current<count){
			hasnext=true
		}
			return hasnext;
		
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			if(!hasNext()){
				throw new NoSuchElementException();

			}
			current++;
			return items[current-1];
		}


	/// TODO :  AÑADIR OTRAS CLASES PARA LOS OTROS ITERADORES
	// FIN ITERADORES

	@SuppressWarnings("unchecked")
	public  ArrayEDList() {
	   // TODO: inicializar los atributos (crear el array con capacidad por defecto)
	}

	@SuppressWarnings("unchecked")
	public  ArrayEDList(int capacity) {
	  // TODO	
	}
	@Override
	public int size() {
		return count.length;
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty=false;
			if(current=>count){
				isEmpty=true;
		}
		return isEmpty;
	}

	
	@Override
	public void addFirst(T elem) {
		if (elem==null){
			throw new NullPointerException();
		} else if (count==size) {
			expandCapacity();
		}
		count++;
		for(int i =size();i<0;i--){
			data[i]=data[i+1];
		}

		}

	}


	@Override
	public void addLast(T elem) {
		// TODO 
	}

	@Override
	public void addPenult(T elem) {
		// TODO	
	}

	@Override
	public void addPos(T elem, int position) {
		// TODO 
	}

	@Override
	public T removeFirst() throws EmptyCollectionException {
		// TODO 
	
		return null;
		
	}

	@Override
	public T removelast() throws EmptyCollectionException {
		// TODO 
		return null;
	}

	@Override
	public T removePenult() throws EmptyCollectionException {
		// TODO 
		return null;
	}

	@Override
	public int removeElem(T elem) throws EmptyCollectionException {
		// TODO 
		return 0;	
	}
	
	@Override
	public T getElemPos(int position) {
		// TODO 
		return null;
	}

	@Override
	public int getPosLast(T elem) {
		// TODO 
		return 0;
	}

	@Override
	public int removeAll(T elem) throws EmptyCollectionException {
		// TODO 
		return 0;
	}

	@Override
	public String toString() {
		// TODO 
		return "";
	}
   
	
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPosFirst(T elem) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IEDList<T> listOfRepeatedElems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countElem(T elem) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ArrayEDListIterator<T>();
	}


	@Override
	public Iterator<T> evenPositionsIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> oddPositionsIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> OddEvenIterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
