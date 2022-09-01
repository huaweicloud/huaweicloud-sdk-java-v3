package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Counters
 */
public class Counters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org.apache.sqoop.submission.counter.SqoopCounters")

    @JacksonXmlProperty(localName = "org.apache.sqoop.submission.counter.SqoopCounters")

    private Counter orgApacheSqoopSubmissionCounterSqoopCounters;

    public Counters withOrgApacheSqoopSubmissionCounterSqoopCounters(
        Counter orgApacheSqoopSubmissionCounterSqoopCounters) {
        this.orgApacheSqoopSubmissionCounterSqoopCounters = orgApacheSqoopSubmissionCounterSqoopCounters;
        return this;
    }

    public Counters withOrgApacheSqoopSubmissionCounterSqoopCounters(
        Consumer<Counter> orgApacheSqoopSubmissionCounterSqoopCountersSetter) {
        if (this.orgApacheSqoopSubmissionCounterSqoopCounters == null) {
            this.orgApacheSqoopSubmissionCounterSqoopCounters = new Counter();
            orgApacheSqoopSubmissionCounterSqoopCountersSetter
                .accept(this.orgApacheSqoopSubmissionCounterSqoopCounters);
        }

        return this;
    }

    /**
     * Get orgApacheSqoopSubmissionCounterSqoopCounters
     * @return orgApacheSqoopSubmissionCounterSqoopCounters
     */
    public Counter getOrgApacheSqoopSubmissionCounterSqoopCounters() {
        return orgApacheSqoopSubmissionCounterSqoopCounters;
    }

    public void setOrgApacheSqoopSubmissionCounterSqoopCounters(Counter orgApacheSqoopSubmissionCounterSqoopCounters) {
        this.orgApacheSqoopSubmissionCounterSqoopCounters = orgApacheSqoopSubmissionCounterSqoopCounters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Counters counters = (Counters) o;
        return Objects.equals(this.orgApacheSqoopSubmissionCounterSqoopCounters,
            counters.orgApacheSqoopSubmissionCounterSqoopCounters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgApacheSqoopSubmissionCounterSqoopCounters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Counters {\n");
        sb.append("    orgApacheSqoopSubmissionCounterSqoopCounters: ")
            .append(toIndentedString(orgApacheSqoopSubmissionCounterSqoopCounters))
            .append("\n");
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
