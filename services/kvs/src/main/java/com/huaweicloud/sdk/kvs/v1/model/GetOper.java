package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetOper
 */
public class GetOper {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_kv")
    @BsonProperty(value = "get_kv")

    private GetKv getKv;

    public GetOper withGetKv(GetKv getKv) {
        this.getKv = getKv;
        return this;
    }

    public GetOper withGetKv(Consumer<GetKv> getKvSetter) {
        if (this.getKv == null) {
            this.getKv = new GetKv();
            getKvSetter.accept(this.getKv);
        }

        return this;
    }

    /**
     * Get getKv
     * @return getKv
     */
    public GetKv getGetKv() {
        return getKv;
    }

    public void setGetKv(GetKv getKv) {
        this.getKv = getKv;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetOper that = (GetOper) obj;
        return Objects.equals(this.getKv, that.getKv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOper {\n");
        sb.append("    getKv: ").append(toIndentedString(getKv)).append("\n");
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
