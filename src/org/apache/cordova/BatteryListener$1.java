// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package org.apache.cordova:
//            BatteryListener

class it> extends BroadcastReceiver
{

    final BatteryListener this$0;

    public void onReceive(Context context, Intent intent)
    {
        BatteryListener.access$000(BatteryListener.this, intent);
    }

    ()
    {
        this$0 = BatteryListener.this;
        super();
    }
}
