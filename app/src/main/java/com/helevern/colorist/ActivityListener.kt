package com.helevern.colorist

import com.google.android.gms.common.api.Status
import com.google.android.gms.fitness.data.Value

data class ActivityListener (var onChange: (value: Value) -> Unit = { }, var onError: (status: Status) -> Unit = { })
