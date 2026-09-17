package com.huaweicloud.sdk.das.v3.model;

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
public class ShowMissingIndexTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend_list")

    private List<MissingIndexTrendPoint> trendList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_cost_trend")

    private UserTrendPercent userCostTrend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_impact_trend")

    private UserTrendPercent userImpactTrend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_seek_trend")

    private UserSeekTrend userSeekTrend;

    public ShowMissingIndexTrendResponse withTrendList(List<MissingIndexTrendPoint> trendList) {
        this.trendList = trendList;
        return this;
    }

    public ShowMissingIndexTrendResponse addTrendListItem(MissingIndexTrendPoint trendListItem) {
        if (this.trendList == null) {
            this.trendList = new ArrayList<>();
        }
        this.trendList.add(trendListItem);
        return this;
    }

    public ShowMissingIndexTrendResponse withTrendList(Consumer<List<MissingIndexTrendPoint>> trendListSetter) {
        if (this.trendList == null) {
            this.trendList = new ArrayList<>();
        }
        trendListSetter.accept(this.trendList);
        return this;
    }

    /**
     * 趋势数量列表
     * @return trendList
     */
    public List<MissingIndexTrendPoint> getTrendList() {
        return trendList;
    }

    public void setTrendList(List<MissingIndexTrendPoint> trendList) {
        this.trendList = trendList;
    }

    public ShowMissingIndexTrendResponse withUserCostTrend(UserTrendPercent userCostTrend) {
        this.userCostTrend = userCostTrend;
        return this;
    }

    public ShowMissingIndexTrendResponse withUserCostTrend(Consumer<UserTrendPercent> userCostTrendSetter) {
        if (this.userCostTrend == null) {
            this.userCostTrend = new UserTrendPercent();
            userCostTrendSetter.accept(this.userCostTrend);
        }

        return this;
    }

    /**
     * Get userCostTrend
     * @return userCostTrend
     */
    public UserTrendPercent getUserCostTrend() {
        return userCostTrend;
    }

    public void setUserCostTrend(UserTrendPercent userCostTrend) {
        this.userCostTrend = userCostTrend;
    }

    public ShowMissingIndexTrendResponse withUserImpactTrend(UserTrendPercent userImpactTrend) {
        this.userImpactTrend = userImpactTrend;
        return this;
    }

    public ShowMissingIndexTrendResponse withUserImpactTrend(Consumer<UserTrendPercent> userImpactTrendSetter) {
        if (this.userImpactTrend == null) {
            this.userImpactTrend = new UserTrendPercent();
            userImpactTrendSetter.accept(this.userImpactTrend);
        }

        return this;
    }

    /**
     * Get userImpactTrend
     * @return userImpactTrend
     */
    public UserTrendPercent getUserImpactTrend() {
        return userImpactTrend;
    }

    public void setUserImpactTrend(UserTrendPercent userImpactTrend) {
        this.userImpactTrend = userImpactTrend;
    }

    public ShowMissingIndexTrendResponse withUserSeekTrend(UserSeekTrend userSeekTrend) {
        this.userSeekTrend = userSeekTrend;
        return this;
    }

    public ShowMissingIndexTrendResponse withUserSeekTrend(Consumer<UserSeekTrend> userSeekTrendSetter) {
        if (this.userSeekTrend == null) {
            this.userSeekTrend = new UserSeekTrend();
            userSeekTrendSetter.accept(this.userSeekTrend);
        }

        return this;
    }

    /**
     * Get userSeekTrend
     * @return userSeekTrend
     */
    public UserSeekTrend getUserSeekTrend() {
        return userSeekTrend;
    }

    public void setUserSeekTrend(UserSeekTrend userSeekTrend) {
        this.userSeekTrend = userSeekTrend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMissingIndexTrendResponse that = (ShowMissingIndexTrendResponse) obj;
        return Objects.equals(this.trendList, that.trendList) && Objects.equals(this.userCostTrend, that.userCostTrend)
            && Objects.equals(this.userImpactTrend, that.userImpactTrend)
            && Objects.equals(this.userSeekTrend, that.userSeekTrend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trendList, userCostTrend, userImpactTrend, userSeekTrend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMissingIndexTrendResponse {\n");
        sb.append("    trendList: ").append(toIndentedString(trendList)).append("\n");
        sb.append("    userCostTrend: ").append(toIndentedString(userCostTrend)).append("\n");
        sb.append("    userImpactTrend: ").append(toIndentedString(userImpactTrend)).append("\n");
        sb.append("    userSeekTrend: ").append(toIndentedString(userSeekTrend)).append("\n");
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
