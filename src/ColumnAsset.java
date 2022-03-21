/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.hyperledger.fabric.samples.assettransfer;

import java.util.ArrayList;
import java.util.Objects;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import com.owlike.genson.annotation.JsonProperty;


public class ColumnAsset {
    @Property
    String columnId;

    @Property
    int inputOrOutput;

    @Property
    String type;

    @Property
    ArrayList<String> potencialValues;
    

    public ColumnAsset(String _columnId, ArrayList<String> _potencialValues, String _type, int _inputOrOutput) {
        this.columnId = _columnId;
        this.inputOrOutput = _inputOrOutput;
        this.type = _type;
        this.potencialValues = _potencialValues;    
    }

    
}
