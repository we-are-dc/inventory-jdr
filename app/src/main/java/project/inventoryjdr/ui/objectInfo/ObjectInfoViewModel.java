package project.inventoryjdr.ui.objectInfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ObjectInfoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ObjectInfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
