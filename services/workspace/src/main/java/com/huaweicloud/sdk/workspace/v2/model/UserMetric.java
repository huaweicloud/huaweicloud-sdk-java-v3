package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UserMetric
 */
public class UserMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private List<Metric> metric = null;

    public UserMetric withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名称
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserMetric withMetric(List<Metric> metric) {
        this.metric = metric;
        return this;
    }

    public UserMetric addMetricItem(Metric metricItem) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        this.metric.add(metricItem);
        return this;
    }

    public UserMetric withMetric(Consumer<List<Metric>> metricSetter) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        metricSetter.accept(this.metric);
        return this;
    }

    /**
     * 桌面使用统计信息 * `user_usage` -  用户使用时长(单位:秒)，同一时间登录多台PC的话;相应的时间会累加 * `user_login_count` -  用户登录次数(单位:次) * `user_login_success_count` -  用户登录成功次数(单位:次) * `user_login_fail_count` -  用户登录失败次数(单位:次)
     * @return metric
     */
    public List<Metric> getMetric() {
        return metric;
    }

    public void setMetric(List<Metric> metric) {
        this.metric = metric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserMetric that = (UserMetric) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.metric, that.metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, metric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserMetric {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
