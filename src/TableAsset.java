/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.hyperledger.fabric.samples.assettransfer;

import java.util.ArrayList;
import java.util.Objects;

import javax.annotation.PropertyKey;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import com.owlike.genson.annotation.JsonProperty;

@DataType()
public class TableAsset {
    
    @Property
    String tableId;

    @Property
    String tableName;

    @Property
    ArrayList<String> columnsId;

    @Property
    String hitPolicy;

    public TableAsset(String tableId2, String tableName, ArrayList<String> columns) {

    }


    public ArrayList<String> getColumns() {
        return columnsId;
    }
}
