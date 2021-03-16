package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.CommonParamV2;
import com.huaweicloud.sdk.osm.v2.model.ExtendsParamV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListExtendsParamsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extends_params")
    
    private List<ExtendsParamV2> extendsParams = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="common_params")
    
    private List<CommonParamV2> commonParams = null;
    
    public ListExtendsParamsResponse withExtendsParams(List<ExtendsParamV2> extendsParams) {
        this.extendsParams = extendsParams;
        return this;
    }

    
    public ListExtendsParamsResponse addExtendsParamsItem(ExtendsParamV2 extendsParamsItem) {
        this.extendsParams.add(extendsParamsItem);
        return this;
    }

    public ListExtendsParamsResponse withExtendsParams(Consumer<List<ExtendsParamV2>> extendsParamsSetter) {
        if(this.extendsParams == null ){
            this.extendsParams = new ArrayList<>();
        }
        extendsParamsSetter.accept(this.extendsParams);
        return this;
    }

    /**
     * 附加参数列表
     * @return extendsParams
     */
    public List<ExtendsParamV2> getExtendsParams() {
        return extendsParams;
    }

    public void setExtendsParams(List<ExtendsParamV2> extendsParams) {
        this.extendsParams = extendsParams;
    }

    

    public ListExtendsParamsResponse withCommonParams(List<CommonParamV2> commonParams) {
        this.commonParams = commonParams;
        return this;
    }

    
    public ListExtendsParamsResponse addCommonParamsItem(CommonParamV2 commonParamsItem) {
        this.commonParams.add(commonParamsItem);
        return this;
    }

    public ListExtendsParamsResponse withCommonParams(Consumer<List<CommonParamV2>> commonParamsSetter) {
        if(this.commonParams == null ){
            this.commonParams = new ArrayList<>();
        }
        commonParamsSetter.accept(this.commonParams);
        return this;
    }

    /**
     * 公共附加参数列表
     * @return commonParams
     */
    public List<CommonParamV2> getCommonParams() {
        return commonParams;
    }

    public void setCommonParams(List<CommonParamV2> commonParams) {
        this.commonParams = commonParams;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListExtendsParamsResponse listExtendsParamsResponse = (ListExtendsParamsResponse) o;
        return Objects.equals(this.extendsParams, listExtendsParamsResponse.extendsParams) &&
            Objects.equals(this.commonParams, listExtendsParamsResponse.commonParams);
    }
    @Override
    public int hashCode() {
        return Objects.hash(extendsParams, commonParams);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExtendsParamsResponse {\n");
        sb.append("    extendsParams: ").append(toIndentedString(extendsParams)).append("\n");
        sb.append("    commonParams: ").append(toIndentedString(commonParams)).append("\n");
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

