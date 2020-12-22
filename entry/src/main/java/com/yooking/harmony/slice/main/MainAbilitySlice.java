package com.yooking.harmony.slice.main;

import com.yooking.harmony.BaseAbilitySlice;
import com.yooking.harmony.ResourceTable;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;

public class MainAbilitySlice extends BaseAbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        initListener();
    }

    private void initListener() {
        addClickedListener(component -> {
            switch (component.getId()){
                case ResourceTable.Id_btn_main_hello:
                    showToast("hello");
                    ((Text)findById(ResourceTable.Id_btn_main_harmony)).setText("123");
                    break;
                case ResourceTable.Id_btn_main_harmony:
                    showToast("Harmony");
                    break;
                case ResourceTable.Id_btn_main_next:
                    present(new Main2AbilitySlice(),new Intent());
                    break;
            }
        },ResourceTable.Id_btn_main_hello,ResourceTable.Id_btn_main_harmony,ResourceTable.Id_btn_main_next);
    }
}
