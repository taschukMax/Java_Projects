package com.hexlet.episode_II.lection3_threads;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 6:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmptyBTree<T extends Comparable<T>> implements IBTree<T> {
    @Override
    public IBTree getLeft() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IBTree getRight() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T getValue() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getCount() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void add(T value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
