package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 更新终端设备孪生参数配置 */
public class TwinUpdateDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twin")

    private ValueInTwin twin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_visitors")

    private TwinUpdateDetailPropertyVisitors propertyVisitors;

    public TwinUpdateDetail withTwin(ValueInTwin twin) {
        this.twin = twin;
        return this;
    }

    public TwinUpdateDetail withTwin(Consumer<ValueInTwin> twinSetter) {
        if (this.twin == null) {
            this.twin = new ValueInTwin();
            twinSetter.accept(this.twin);
        }

        return this;
    }

    /** Get twin
     * 
     * @return twin */
    public ValueInTwin getTwin() {
        return twin;
    }

    public void setTwin(ValueInTwin twin) {
        this.twin = twin;
    }

    public TwinUpdateDetail withPropertyVisitors(TwinUpdateDetailPropertyVisitors propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
        return this;
    }

    public TwinUpdateDetail withPropertyVisitors(Consumer<TwinUpdateDetailPropertyVisitors> propertyVisitorsSetter) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new TwinUpdateDetailPropertyVisitors();
            propertyVisitorsSetter.accept(this.propertyVisitors);
        }

        return this;
    }

    /** Get propertyVisitors
     * 
     * @return propertyVisitors */
    public TwinUpdateDetailPropertyVisitors getPropertyVisitors() {
        return propertyVisitors;
    }

    public void setPropertyVisitors(TwinUpdateDetailPropertyVisitors propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TwinUpdateDetail twinUpdateDetail = (TwinUpdateDetail) o;
        return Objects.equals(this.twin, twinUpdateDetail.twin)
            && Objects.equals(this.propertyVisitors, twinUpdateDetail.propertyVisitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(twin, propertyVisitors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TwinUpdateDetail {\n");
        sb.append("    twin: ").append(toIndentedString(twin)).append("\n");
        sb.append("    propertyVisitors: ").append(toIndentedString(propertyVisitors)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
