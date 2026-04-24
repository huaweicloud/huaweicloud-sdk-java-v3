package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 列加工对象
 */
public class ColumnProcessObjects {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_source_names")

    private List<String> objectSourceNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_alias_name")

    private String objectAliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sent")

    private Boolean isSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_column_infos")

    private List<AddColumnInfo> extraColumnInfos = null;

    public ColumnProcessObjects withObjectSourceNames(List<String> objectSourceNames) {
        this.objectSourceNames = objectSourceNames;
        return this;
    }

    public ColumnProcessObjects addObjectSourceNamesItem(String objectSourceNamesItem) {
        if (this.objectSourceNames == null) {
            this.objectSourceNames = new ArrayList<>();
        }
        this.objectSourceNames.add(objectSourceNamesItem);
        return this;
    }

    public ColumnProcessObjects withObjectSourceNames(Consumer<List<String>> objectSourceNamesSetter) {
        if (this.objectSourceNames == null) {
            this.objectSourceNames = new ArrayList<>();
        }
        objectSourceNamesSetter.accept(this.objectSourceNames);
        return this;
    }

    /**
     * 选择的源库对象名
     * @return objectSourceNames
     */
    public List<String> getObjectSourceNames() {
        return objectSourceNames;
    }

    public void setObjectSourceNames(List<String> objectSourceNames) {
        this.objectSourceNames = objectSourceNames;
    }

    public ColumnProcessObjects withObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
        return this;
    }

    /**
     * 映射后的对象名
     * @return objectAliasName
     */
    public String getObjectAliasName() {
        return objectAliasName;
    }

    public void setObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
    }

    public ColumnProcessObjects withIsSent(Boolean isSent) {
        this.isSent = isSent;
        return this;
    }

    /**
     * 附加列是否已下发
     * @return isSent
     */
    public Boolean getIsSent() {
        return isSent;
    }

    public void setIsSent(Boolean isSent) {
        this.isSent = isSent;
    }

    public ColumnProcessObjects withExtraColumnInfos(List<AddColumnInfo> extraColumnInfos) {
        this.extraColumnInfos = extraColumnInfos;
        return this;
    }

    public ColumnProcessObjects addExtraColumnInfosItem(AddColumnInfo extraColumnInfosItem) {
        if (this.extraColumnInfos == null) {
            this.extraColumnInfos = new ArrayList<>();
        }
        this.extraColumnInfos.add(extraColumnInfosItem);
        return this;
    }

    public ColumnProcessObjects withExtraColumnInfos(Consumer<List<AddColumnInfo>> extraColumnInfosSetter) {
        if (this.extraColumnInfos == null) {
            this.extraColumnInfos = new ArrayList<>();
        }
        extraColumnInfosSetter.accept(this.extraColumnInfos);
        return this;
    }

    /**
     * 附加列信息
     * @return extraColumnInfos
     */
    public List<AddColumnInfo> getExtraColumnInfos() {
        return extraColumnInfos;
    }

    public void setExtraColumnInfos(List<AddColumnInfo> extraColumnInfos) {
        this.extraColumnInfos = extraColumnInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnProcessObjects that = (ColumnProcessObjects) obj;
        return Objects.equals(this.objectSourceNames, that.objectSourceNames)
            && Objects.equals(this.objectAliasName, that.objectAliasName) && Objects.equals(this.isSent, that.isSent)
            && Objects.equals(this.extraColumnInfos, that.extraColumnInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectSourceNames, objectAliasName, isSent, extraColumnInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnProcessObjects {\n");
        sb.append("    objectSourceNames: ").append(toIndentedString(objectSourceNames)).append("\n");
        sb.append("    objectAliasName: ").append(toIndentedString(objectAliasName)).append("\n");
        sb.append("    isSent: ").append(toIndentedString(isSent)).append("\n");
        sb.append("    extraColumnInfos: ").append(toIndentedString(extraColumnInfos)).append("\n");
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
