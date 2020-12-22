package com.yooking.harmony.ability;

import com.yooking.harmony.slice.main.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
//        addActionRoute("action.next", NextAbilitySlice.class.getName());
    }
}
