package com.huaweicloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class RegisterImageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RegisterImageRequestBody body;

    public RegisterImageRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /** 镜像ID。 image_id为用户调用创建镜像元数据接口所创建出来镜像的id，使用其他方式创建的镜像id会导致注册失败。
     * 注册接口调用成功后，请根据镜像id查询镜像的状态。镜像状态变为active表示镜像注册成功，详情请参见查询镜像详情（OpenStack原生）。
     * 
     * @return imageId */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public RegisterImageRequest withBody(RegisterImageRequestBody body) {
        this.body = body;
        return this;
    }

    public RegisterImageRequest withBody(Consumer<RegisterImageRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new RegisterImageRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public RegisterImageRequestBody getBody() {
        return body;
    }

    public void setBody(RegisterImageRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterImageRequest registerImageRequest = (RegisterImageRequest) o;
        return Objects.equals(this.imageId, registerImageRequest.imageId)
            && Objects.equals(this.body, registerImageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterImageRequest {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
