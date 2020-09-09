package com.huaweicloud.sdk.testhub.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.testhub.v1.model.ErrorCaseInfoBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ErrorDetailInfo
 */
public class ErrorDetailInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed")
    
    private List<ErrorCaseInfoBean> failed = null;
    
    public ErrorDetailInfo withFailed(List<ErrorCaseInfoBean> failed) {
        this.failed = failed;
        return this;
    }

    
    public ErrorDetailInfo addFailedItem(ErrorCaseInfoBean failedItem) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    public ErrorDetailInfo withFailed(Consumer<List<ErrorCaseInfoBean>> failedSetter) {
        if(this.failed == null ){
            this.failed = new ArrayList<>();
        }
        failedSetter.accept(this.failed);
        return this;
    }

    /**
     * 批量操作失败的资源的详情信息
     * @return failed
     */
    public List<ErrorCaseInfoBean> getFailed() {
        return failed;
    }

    public void setFailed(List<ErrorCaseInfoBean> failed) {
        this.failed = failed;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorDetailInfo errorDetailInfo = (ErrorDetailInfo) o;
        return Objects.equals(this.failed, errorDetailInfo.failed);
    }
    @Override
    public int hashCode() {
        return Objects.hash(failed);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorDetailInfo {\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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

