package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 物理专线更新对象参数
 */
public class UpdateDirectConnectRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect")

    private UpdateDirectConnect directConnect;

    public UpdateDirectConnectRequestBody withDirectConnect(UpdateDirectConnect directConnect) {
        this.directConnect = directConnect;
        return this;
    }

    public UpdateDirectConnectRequestBody withDirectConnect(Consumer<UpdateDirectConnect> directConnectSetter) {
        if (this.directConnect == null) {
            this.directConnect = new UpdateDirectConnect();
            directConnectSetter.accept(this.directConnect);
        }

        return this;
    }

    /**
     * Get directConnect
     * @return directConnect
     */
    public UpdateDirectConnect getDirectConnect() {
        return directConnect;
    }

    public void setDirectConnect(UpdateDirectConnect directConnect) {
        this.directConnect = directConnect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDirectConnectRequestBody that = (UpdateDirectConnectRequestBody) obj;
        return Objects.equals(this.directConnect, that.directConnect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directConnect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDirectConnectRequestBody {\n");
        sb.append("    directConnect: ").append(toIndentedString(directConnect)).append("\n");
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
