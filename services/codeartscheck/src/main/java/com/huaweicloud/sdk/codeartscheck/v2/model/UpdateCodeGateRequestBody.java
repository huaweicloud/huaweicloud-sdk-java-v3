package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 门禁配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class UpdateCodeGateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewData")

    private List<ReviewDataInfoRequestParam> reviewData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public UpdateCodeGateRequestBody withReviewData(List<ReviewDataInfoRequestParam> reviewData) {
        this.reviewData = reviewData;
        return this;
    }

    public UpdateCodeGateRequestBody addReviewDataItem(ReviewDataInfoRequestParam reviewDataItem) {
        if (this.reviewData == null) {
            this.reviewData = new ArrayList<>();
        }
        this.reviewData.add(reviewDataItem);
        return this;
    }

    public UpdateCodeGateRequestBody withReviewData(Consumer<List<ReviewDataInfoRequestParam>> reviewDataSetter) {
        if (this.reviewData == null) {
            this.reviewData = new ArrayList<>();
        }
        reviewDataSetter.accept(this.reviewData);
        return this;
    }

    /**
     * **参数解释：** 任务门禁配置列表。 **约束限制：** 不涉及。
     * @return reviewData
     */
    public List<ReviewDataInfoRequestParam> getReviewData() {
        return reviewData;
    }

    public void setReviewData(List<ReviewDataInfoRequestParam> reviewData) {
        this.reviewData = reviewData;
    }

    public UpdateCodeGateRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 任务ID，即新建检查任务接口的返回值，每个代码检查任务及其下的分支任务、通过API创建的增量任务都有唯一的任务ID。即[[查询任务列表](https://support.huaweicloud.com/api-codecheck/ShowTasksList.html)](tag:hws)[[查询任务列表](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ShowTasksList.html)](tag:hws_hk)[查询任务列表](tag:hcs,hcs_sm)接口响应中的id字段。 **约束限制：** 不涉及。 **取值范围：** 长度为[1~32]个字符。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCodeGateRequestBody that = (UpdateCodeGateRequestBody) obj;
        return Objects.equals(this.reviewData, that.reviewData) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewData, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCodeGateRequestBody {\n");
        sb.append("    reviewData: ").append(toIndentedString(reviewData)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
