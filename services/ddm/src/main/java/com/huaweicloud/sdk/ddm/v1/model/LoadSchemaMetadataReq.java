package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LoadSchemaMetadataReq
 */
public class LoadSchemaMetadataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compressed_databases_info")

    private String compressedDatabasesInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_instance")

    private List<DNInstance> dnInstance = null;

    public LoadSchemaMetadataReq withCompressedDatabasesInfo(String compressedDatabasesInfo) {
        this.compressedDatabasesInfo = compressedDatabasesInfo;
        return this;
    }

    /**
     * 逻辑库信息。
     * @return compressedDatabasesInfo
     */
    public String getCompressedDatabasesInfo() {
        return compressedDatabasesInfo;
    }

    public void setCompressedDatabasesInfo(String compressedDatabasesInfo) {
        this.compressedDatabasesInfo = compressedDatabasesInfo;
    }

    public LoadSchemaMetadataReq withDnInstance(List<DNInstance> dnInstance) {
        this.dnInstance = dnInstance;
        return this;
    }

    public LoadSchemaMetadataReq addDnInstanceItem(DNInstance dnInstanceItem) {
        if (this.dnInstance == null) {
            this.dnInstance = new ArrayList<>();
        }
        this.dnInstance.add(dnInstanceItem);
        return this;
    }

    public LoadSchemaMetadataReq withDnInstance(Consumer<List<DNInstance>> dnInstanceSetter) {
        if (this.dnInstance == null) {
            this.dnInstance = new ArrayList<>();
        }
        dnInstanceSetter.accept(this.dnInstance);
        return this;
    }

    /**
     * 关联的后端DN信息。
     * @return dnInstance
     */
    public List<DNInstance> getDnInstance() {
        return dnInstance;
    }

    public void setDnInstance(List<DNInstance> dnInstance) {
        this.dnInstance = dnInstance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadSchemaMetadataReq that = (LoadSchemaMetadataReq) obj;
        return Objects.equals(this.compressedDatabasesInfo, that.compressedDatabasesInfo)
            && Objects.equals(this.dnInstance, that.dnInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compressedDatabasesInfo, dnInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadSchemaMetadataReq {\n");
        sb.append("    compressedDatabasesInfo: ").append(toIndentedString(compressedDatabasesInfo)).append("\n");
        sb.append("    dnInstance: ").append(toIndentedString(dnInstance)).append("\n");
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
