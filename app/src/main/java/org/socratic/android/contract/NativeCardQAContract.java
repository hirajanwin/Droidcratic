package org.socratic.android.contract;

import org.socratic.android.viewmodel.ViewModelAdapter;

/**
 * Created by williamxu on 7/14/17.
 */

public interface NativeCardQAContract {

    interface View extends ViewAdapter {

    }

    interface ViewModel extends ViewModelAdapter<View> {

    }
}
