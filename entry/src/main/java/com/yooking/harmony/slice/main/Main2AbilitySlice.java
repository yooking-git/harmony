package com.yooking.harmony.slice.main;

import com.yooking.harmony.BaseAbilitySlice;
import com.yooking.harmony.ResourceTable;
import com.yooking.harmony.ability.NextAbility;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;

public class Main2AbilitySlice extends BaseAbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main2);
        initClickListener();
    }

    private void initClickListener() {
        addClickedListener(component -> {
            switch (component.getId()){
                case ResourceTable.Id_btn_main2_hello:
                    showToast("hello");
                    break;
                case ResourceTable.Id_btn_main2_harmony:
                    showToast("Harmony");
                    break;
                case ResourceTable.Id_btn_main2_next:
                    Intent intent = new Intent();
                    Operation operation= new Intent.OperationBuilder()
                            .withDeviceId("")
                            .withBundleName(getBundleName())
                            .withAbilityName(NextAbility.class.getName())
                            .build();
                    intent.setOperation(operation);
                    startAbility(intent);
                    break;
            }
        },ResourceTable.Id_btn_main2_hello,ResourceTable.Id_btn_main2_harmony,ResourceTable.Id_btn_main2_next);
    }
}
