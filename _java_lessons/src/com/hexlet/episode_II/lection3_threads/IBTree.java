package com.hexlet.episode_II.lection3_threads;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IBTree<T extends Comparable<T>> {
    public IBTree getLeft();

    public IBTree getRight();

    public T getValue();

    public int getCount();

    public void add(T value);
}
