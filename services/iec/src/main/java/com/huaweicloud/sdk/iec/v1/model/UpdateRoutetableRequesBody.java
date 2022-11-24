package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新路由表请求体
 */
public class UpdateRoutetableRequesBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable")

    private UpdateRoutetableOption routetable;

    public UpdateRoutetableRequesBody withRoutetable(UpdateRoutetableOption routetable) {
        this.routetable = routetable;
        return this;
    }

    public UpdateRoutetableRequesBody withRoutetable(Consumer<UpdateRoutetableOption> routetableSetter) {
        if (this.routetable == null) {
            this.routetable = new UpdateRoutetableOption();
            routetableSetter.accept(this.routetable);
        }

        return this;
    }

    /**
     * Get routetable
     * @return routetable
     */
    public UpdateRoutetableOption getRoutetable() {
        return routetable;
    }

    public void setRoutetable(UpdateRoutetableOption routetable) {
        this.routetable = routetable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRoutetableRequesBody updateRoutetableRequesBody = (UpdateRoutetableRequesBody) o;
        return Objects.equals(this.routetable, updateRoutetableRequesBody.routetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoutetableRequesBody {\n");
        sb.append("    routetable: ").append(toIndentedString(routetable)).append("\n");
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
