package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务按需转包请求体
 */
public class ChangeToPeriodReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_ids")

    private List<String> publicipIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private CreatePrePaidPublicipExtendParamOption extendParam;

    public ChangeToPeriodReq withPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
        return this;
    }

    public ChangeToPeriodReq addPublicipIdsItem(String publicipIdsItem) {
        if (this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        this.publicipIds.add(publicipIdsItem);
        return this;
    }

    public ChangeToPeriodReq withPublicipIds(Consumer<List<String>> publicipIdsSetter) {
        if (this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        publicipIdsSetter.accept(this.publicipIds);
        return this;
    }

    /**
     * 待按需转包IP列表 
     * @return publicipIds
     */
    public List<String> getPublicipIds() {
        return publicipIds;
    }

    public void setPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
    }

    public ChangeToPeriodReq withExtendParam(CreatePrePaidPublicipExtendParamOption extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ChangeToPeriodReq withExtendParam(Consumer<CreatePrePaidPublicipExtendParamOption> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new CreatePrePaidPublicipExtendParamOption();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public CreatePrePaidPublicipExtendParamOption getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(CreatePrePaidPublicipExtendParamOption extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeToPeriodReq changeToPeriodReq = (ChangeToPeriodReq) o;
        return Objects.equals(this.publicipIds, changeToPeriodReq.publicipIds)
            && Objects.equals(this.extendParam, changeToPeriodReq.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipIds, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeToPeriodReq {\n");
        sb.append("    publicipIds: ").append(toIndentedString(publicipIds)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
