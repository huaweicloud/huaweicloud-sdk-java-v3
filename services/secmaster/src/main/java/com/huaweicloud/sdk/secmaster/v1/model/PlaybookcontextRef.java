package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 运行流程的上下文
 */
public class PlaybookcontextRef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private DataObjectRefInfo dataObject;

    public PlaybookcontextRef withDataObject(DataObjectRefInfo dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public PlaybookcontextRef withDataObject(Consumer<DataObjectRefInfo> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new DataObjectRefInfo();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public DataObjectRefInfo getDataObject() {
        return dataObject;
    }

    public void setDataObject(DataObjectRefInfo dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlaybookcontextRef that = (PlaybookcontextRef) obj;
        return Objects.equals(this.dataObject, that.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaybookcontextRef {\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
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
