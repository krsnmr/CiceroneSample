package com.example.ciceronesample.hello;

import android.support.v4.app.Fragment;

import java.lang.ref.WeakReference;
import java.util.List;

public interface ChainHolder {
	List<WeakReference<Fragment>> getChain();
}
