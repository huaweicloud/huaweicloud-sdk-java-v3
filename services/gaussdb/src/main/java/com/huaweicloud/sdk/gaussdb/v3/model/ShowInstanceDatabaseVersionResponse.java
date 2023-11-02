package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceDatabaseVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private InstanceDatabaseVersionInfo datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_flag")

    private Boolean upgradeFlag;

    public ShowInstanceDatabaseVersionResponse withDatastore(InstanceDatabaseVersionInfo datastore) {
        this.datastore = datastore;
        return this;
    }

    public ShowInstanceDatabaseVersionResponse withDatastore(Consumer<InstanceDatabaseVersionInfo> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new InstanceDatabaseVersionInfo();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public InstanceDatabaseVersionInfo getDatastore() {
        return datastore;
    }

    public void setDatastore(InstanceDatabaseVersionInfo datastore) {
        this.datastore = datastore;
    }

    public ShowInstanceDatabaseVersionResponse withUpgradeFlag(Boolean upgradeFlag) {
        this.upgradeFlag = upgradeFlag;
        return this;
    }

    /**
     * 是否可升级。 - true：是。 - false：否。
     * @return upgradeFlag
     */
    public Boolean getUpgradeFlag() {
        return upgradeFlag;
    }

    public void setUpgradeFlag(Boolean upgradeFlag) {
        this.upgradeFlag = upgradeFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceDatabaseVersionResponse that = (ShowInstanceDatabaseVersionResponse) obj;
        return Objects.equals(this.datastore, that.datastore) && Objects.equals(this.upgradeFlag, that.upgradeFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastore, upgradeFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceDatabaseVersionResponse {\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    upgradeFlag: ").append(toIndentedString(upgradeFlag)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
