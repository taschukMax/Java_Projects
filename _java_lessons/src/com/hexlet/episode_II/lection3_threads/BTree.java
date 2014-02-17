package com.hexlet.episode_II.lection3_threads;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 5:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class BTree<T extends Comparable<T>> implements IBTree<T> {
    private final IBTree<T> right;
    private final IBTree<T> left;
    private final T value;

    public BTree(IBTree<T> left, IBTree<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    private int count;

    @Override
    public IBTree getLeft() {
        return left;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IBTree getRight() {
        return right;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void add(T value) {
        if (value.equals(getValue())) {
            count++;
        } else if (value.compareTo(getValue()) > 0) {
            getLeft().add(value);
        } else {
            getRight().add(value);
        }
    }
}
