package com.huaweicloud.sdk.mapds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMapTileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "z")

    private Integer z;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private Integer x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private Integer y;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    public ShowMapTileRequest withZ(Integer z) {
        this.z = z;
        return this;
    }

    /**
     * 缩放级别，取值范围[0~20]。
     * @return z
     */
    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public ShowMapTileRequest withX(Integer x) {
        this.x = x;
        return this;
    }

    /**
     * 缩放网格上的 X 坐标。 值必须在 [0, 2的z次方-1] 范围内。
     * @return x
     */
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public ShowMapTileRequest withY(Integer y) {
        this.y = y;
        return this;
    }

    /**
     * 缩放网格上的 Y 坐标。 值必须在 [0, 2的z次方-1] 范围内。
     * @return y
     */
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public ShowMapTileRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 签名消息头为：  Authorization: HMAC-SHA256 Clientid=xxxx,Expiry=xxxx,Signature=xxxx  HMAC-SHA256为固定签名算法，Clientid、Expiry、Signature的值从获取获取SAS token请求返回的消息体中获取，要求Clientid，Expiry，Signature同时存在。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMapTileRequest showMapTileRequest = (ShowMapTileRequest) o;
        return Objects.equals(this.z, showMapTileRequest.z) && Objects.equals(this.x, showMapTileRequest.x)
            && Objects.equals(this.y, showMapTileRequest.y)
            && Objects.equals(this.authorization, showMapTileRequest.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(z, x, y, authorization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMapTileRequest {\n");
        sb.append("    z: ").append(toIndentedString(z)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
