package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新数据源配置
 */
public class ReconfigureExtDataSourceActionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reconfigure")

    private ReconfigureExtDataSourceAction reconfigure;

    public ReconfigureExtDataSourceActionReq withReconfigure(ReconfigureExtDataSourceAction reconfigure) {
        this.reconfigure = reconfigure;
        return this;
    }

    public ReconfigureExtDataSourceActionReq withReconfigure(
        Consumer<ReconfigureExtDataSourceAction> reconfigureSetter) {
        if (this.reconfigure == null) {
            this.reconfigure = new ReconfigureExtDataSourceAction();
            reconfigureSetter.accept(this.reconfigure);
        }

        return this;
    }

    /**
     * Get reconfigure
     * @return reconfigure
     */
    public ReconfigureExtDataSourceAction getReconfigure() {
        return reconfigure;
    }

    public void setReconfigure(ReconfigureExtDataSourceAction reconfigure) {
        this.reconfigure = reconfigure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReconfigureExtDataSourceActionReq that = (ReconfigureExtDataSourceActionReq) obj;
        return Objects.equals(this.reconfigure, that.reconfigure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reconfigure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReconfigureExtDataSourceActionReq {\n");
        sb.append("    reconfigure: ").append(toIndentedString(reconfigure)).append("\n");
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
