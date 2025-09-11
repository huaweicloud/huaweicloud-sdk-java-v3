package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListKmsTdeKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_details")

    private List<ListKmsTdeKeyResponseBodyKeyDetails> keyDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized_id")

    private String authorizedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized_name")

    private String authorizedName;

    public ListKmsTdeKeyResponse withKeyDetails(List<ListKmsTdeKeyResponseBodyKeyDetails> keyDetails) {
        this.keyDetails = keyDetails;
        return this;
    }

    public ListKmsTdeKeyResponse addKeyDetailsItem(ListKmsTdeKeyResponseBodyKeyDetails keyDetailsItem) {
        if (this.keyDetails == null) {
            this.keyDetails = new ArrayList<>();
        }
        this.keyDetails.add(keyDetailsItem);
        return this;
    }

    public ListKmsTdeKeyResponse withKeyDetails(Consumer<List<ListKmsTdeKeyResponseBodyKeyDetails>> keyDetailsSetter) {
        if (this.keyDetails == null) {
            this.keyDetails = new ArrayList<>();
        }
        keyDetailsSetter.accept(this.keyDetails);
        return this;
    }

    /**
     * **参数解释**: kms秘钥列表。
     * @return keyDetails
     */
    public List<ListKmsTdeKeyResponseBodyKeyDetails> getKeyDetails() {
        return keyDetails;
    }

    public void setKeyDetails(List<ListKmsTdeKeyResponseBodyKeyDetails> keyDetails) {
        this.keyDetails = keyDetails;
    }

    public ListKmsTdeKeyResponse withAuthorizedId(String authorizedId) {
        this.authorizedId = authorizedId;
        return this;
    }

    /**
     * **参数解释**: 授权用户ID，在开启透明加密能力时，必须对当前用户ID进行授权。 授权操作参考创建授权接口 https://support.huaweicloud.com/api-dew/CreateGrant.html。 **取值范围**: 不涉及。
     * @return authorizedId
     */
    public String getAuthorizedId() {
        return authorizedId;
    }

    public void setAuthorizedId(String authorizedId) {
        this.authorizedId = authorizedId;
    }

    public ListKmsTdeKeyResponse withAuthorizedName(String authorizedName) {
        this.authorizedName = authorizedName;
        return this;
    }

    /**
     * **参数解释**: 授权用户名称。 **取值范围**: 不涉及。
     * @return authorizedName
     */
    public String getAuthorizedName() {
        return authorizedName;
    }

    public void setAuthorizedName(String authorizedName) {
        this.authorizedName = authorizedName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKmsTdeKeyResponse that = (ListKmsTdeKeyResponse) obj;
        return Objects.equals(this.keyDetails, that.keyDetails) && Objects.equals(this.authorizedId, that.authorizedId)
            && Objects.equals(this.authorizedName, that.authorizedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyDetails, authorizedId, authorizedName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKmsTdeKeyResponse {\n");
        sb.append("    keyDetails: ").append(toIndentedString(keyDetails)).append("\n");
        sb.append("    authorizedId: ").append(toIndentedString(authorizedId)).append("\n");
        sb.append("    authorizedName: ").append(toIndentedString(authorizedName)).append("\n");
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
