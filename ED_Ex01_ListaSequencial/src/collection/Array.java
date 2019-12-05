package collection;

import model.Aluno;

public class Array {
	private Object[] objects;
	private int objectsAmount = 0;

	public Array(int arraySize) {
		objects = new Object[arraySize];
	}

	public Array() {
		objects = new Object[20];
	}

	public void add(Object o) {
		this.checkSize();
		this.objects[this.objectsAmount] = o;
		this.objectsAmount++;
	}

	public void add(Object o, int pos) {
		this.checkSize();
		if (!this.positionIsValid(pos)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for (int i = this.objectsAmount - 1; i >= pos; i--) {
			this.objects[i + 1] = this.objects[i];
		}
		this.objects[pos] = o;
		this.objectsAmount++;
	}

	public Object getObject(int pos) {
		if (!this.positionIsOcupped(pos)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.objects[pos];
	}

	public void remove(int pos) {
		if (!this.positionIsOcupped(pos)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for (int i = 0; i < this.objectsAmount - 1; i++) {
			this.objects[i] = this.objects[i + 1];
		}
		this.objectsAmount--;
	}

	public void checkSize() {
		if (this.objectsAmount == this.objects.length) {
			Object[] newArray = new Object[objectsAmount * 2];
			for (int i = 0; i < this.objects.length; i++) {
				newArray[i] = this.objects[i];
			}
			this.objects = newArray;
		}
	}

	public boolean positionIsOcupped(int pos) {
		return pos >= 0 && pos < this.objectsAmount;
	}

	public boolean positionIsValid(int pos) {
		return pos >= 0 && pos <= this.objectsAmount;
	}

	public int getSize() {
		return this.objectsAmount;
	}

	public boolean contains(Object o) {
		for (int i = 0; i < this.objectsAmount - 1; i++) {
			if (o.equals(this.objects[i])) {
				return true;
			}
		}
		return false;
	}

	public void printObjects() {
		for (int i = 0; i < this.objectsAmount; i++) {
			Aluno aluno = (Aluno)this.objects[i];
			System.out.println("Aluno: " + aluno.getNome());
		}
		System.out.print("\n");
	}

	public void printObject(int pos) {
		Aluno aluno = (Aluno)this.getObject(pos);
		System.out.println("Aluno: " + aluno.getNome() + "\n");
	}
}
