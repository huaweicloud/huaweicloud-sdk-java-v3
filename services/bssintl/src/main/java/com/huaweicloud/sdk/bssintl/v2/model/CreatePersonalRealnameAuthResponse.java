package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreatePersonalRealnameAuthResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_review")
    
    private Integer isReview;

    public CreatePersonalRealnameAuthResponse withIsReview(Integer isReview) {
        this.isReview = isReview;
        return this;
    }

    


    /**
     * |参数名称：是否需要转人工审核，只有状态码为200才返回该参数：0：不需要1：需要| |参数的约束及描述：是否需要转人工审核，只有状态码为200才返回该参数：0：不需要1：需要|
     * @return isReview
     */
    public Integer getIsReview() {
        return isReview;
    }

    public void setIsReview(Integer isReview) {
        this.isReview = isReview;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePersonalRealnameAuthResponse createPersonalRealnameAuthResponse = (CreatePersonalRealnameAuthResponse) o;
        return Objects.equals(this.isReview, createPersonalRealnameAuthResponse.isReview);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isReview);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePersonalRealnameAuthResponse {\n");
        sb.append("    isReview: ").append(toIndentedString(isReview)).append("\n");
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

