package com.huaweicloud.sdk.aad.v2;

import com.huaweicloud.sdk.aad.v2.model.CreateAadDomainRequestBody;
import com.huaweicloud.sdk.aad.v2.model.CreateDomainRequest;
import com.huaweicloud.sdk.aad.v2.model.CreateDomainResponse;
import com.huaweicloud.sdk.aad.v2.model.DeleteDomainRequest;
import com.huaweicloud.sdk.aad.v2.model.DeleteDomainResponse;
import com.huaweicloud.sdk.aad.v2.model.DeleteDomainV2RequestBody;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSAttackEventRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSAttackEventRequestBody;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSAttackEventResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSConnectionNumberRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSConnectionNumberResponse;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSFlowRequest;
import com.huaweicloud.sdk.aad.v2.model.ListDDoSFlowResponse;
import com.huaweicloud.sdk.aad.v2.model.ListFrequencyControlRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListFrequencyControlRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListInstanceDomainsRequest;
import com.huaweicloud.sdk.aad.v2.model.ListInstanceDomainsResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafAttackEventRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafAttackEventResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafBandwidthRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafBandwidthResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafCustomRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafCustomRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafGeoIpRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafGeoIpRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafQpsRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafQpsResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWafWhiteIpRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWafWhiteIpRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ListWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.aad.v2.model.ListWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainCertificateRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowDomainCertificateResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowFlowBlockRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowFlowBlockResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowWafPolicyRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowWafPolicyResponse;
import com.huaweicloud.sdk.aad.v2.model.ShowWafQpsRequest;
import com.huaweicloud.sdk.aad.v2.model.ShowWafQpsResponse;
import com.huaweicloud.sdk.aad.v2.model.UpgradeInstanceSpecRequest;
import com.huaweicloud.sdk.aad.v2.model.UpgradeInstanceSpecResponse;
import com.huaweicloud.sdk.aad.v2.model.UpgradeInstanceSpecV2RequestBody;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AadMeta {

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForCreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForCreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v2/aad/domains")
                .withContentType("application/json");

        // requests
        builder.<CreateAadDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAadDomainRequestBody.class),
            f -> f.withMarshaller(CreateDomainRequest::getBody, CreateDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDDoSAttackEventRequest, ListDDoSAttackEventResponse> listDDoSAttackEvent =
        genForListDDoSAttackEvent();

    private static HttpRequestDef<ListDDoSAttackEventRequest, ListDDoSAttackEventResponse> genForListDDoSAttackEvent() {
        // basic
        HttpRequestDef.Builder<ListDDoSAttackEventRequest, ListDDoSAttackEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListDDoSAttackEventRequest.class, ListDDoSAttackEventResponse.class)
                .withName("ListDDoSAttackEvent")
                .withUri("/v2/aad/instances/{instance_id}/ddos-info/attack/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSAttackEventRequest::getInstanceId,
                ListDDoSAttackEventRequest::setInstanceId));
        builder.<ListDDoSAttackEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDDoSAttackEventRequestBody.class),
            f -> f.withMarshaller(ListDDoSAttackEventRequest::getBody, ListDDoSAttackEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDDoSConnectionNumberRequest, ListDDoSConnectionNumberResponse> listDDoSConnectionNumber =
        genForListDDoSConnectionNumber();

    private static HttpRequestDef<ListDDoSConnectionNumberRequest, ListDDoSConnectionNumberResponse> genForListDDoSConnectionNumber() {
        // basic
        HttpRequestDef.Builder<ListDDoSConnectionNumberRequest, ListDDoSConnectionNumberResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListDDoSConnectionNumberRequest.class, ListDDoSConnectionNumberResponse.class)
                .withName("ListDDoSConnectionNumber")
                .withUri("/v2/aad/instances/{instance_id}/ddos-info/flow/connection-numbers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSConnectionNumberRequest::getInstanceId,
                ListDDoSConnectionNumberRequest::setInstanceId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSConnectionNumberRequest::getStartTime,
                ListDDoSConnectionNumberRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSConnectionNumberRequest::getEndTime,
                ListDDoSConnectionNumberRequest::setEndTime));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSConnectionNumberRequest::getIp, ListDDoSConnectionNumberRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDDoSFlowRequest, ListDDoSFlowResponse> listDDoSFlow = genForListDDoSFlow();

    private static HttpRequestDef<ListDDoSFlowRequest, ListDDoSFlowResponse> genForListDDoSFlow() {
        // basic
        HttpRequestDef.Builder<ListDDoSFlowRequest, ListDDoSFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDDoSFlowRequest.class, ListDDoSFlowResponse.class)
                .withName("ListDDoSFlow")
                .withUri("/v2/aad/instances/{instance_id}/ddos-info/flow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSFlowRequest::getInstanceId, ListDDoSFlowRequest::setInstanceId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSFlowRequest::getIp, ListDDoSFlowRequest::setIp));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSFlowRequest::getType, ListDDoSFlowRequest::setType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSFlowRequest::getStartTime, ListDDoSFlowRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDoSFlowRequest::getEndTime, ListDDoSFlowRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFrequencyControlRuleRequest, ListFrequencyControlRuleResponse> listFrequencyControlRule =
        genForListFrequencyControlRule();

    private static HttpRequestDef<ListFrequencyControlRuleRequest, ListFrequencyControlRuleResponse> genForListFrequencyControlRule() {
        // basic
        HttpRequestDef.Builder<ListFrequencyControlRuleRequest, ListFrequencyControlRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListFrequencyControlRuleRequest.class, ListFrequencyControlRuleResponse.class)
                .withName("ListFrequencyControlRule")
                .withUri("/v2/aad/policies/waf/frequency-control-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFrequencyControlRuleRequest::getDomainName,
                ListFrequencyControlRuleRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceDomainsRequest, ListInstanceDomainsResponse> listInstanceDomains =
        genForListInstanceDomains();

    private static HttpRequestDef<ListInstanceDomainsRequest, ListInstanceDomainsResponse> genForListInstanceDomains() {
        // basic
        HttpRequestDef.Builder<ListInstanceDomainsRequest, ListInstanceDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceDomainsRequest.class, ListInstanceDomainsResponse.class)
                .withName("ListInstanceDomains")
                .withUri("/v2/aad/instances/{instance_id}/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceDomainsRequest::getInstanceId,
                ListInstanceDomainsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWafAttackEventRequest, ListWafAttackEventResponse> listWafAttackEvent =
        genForListWafAttackEvent();

    private static HttpRequestDef<ListWafAttackEventRequest, ListWafAttackEventResponse> genForListWafAttackEvent() {
        // basic
        HttpRequestDef.Builder<ListWafAttackEventRequest, ListWafAttackEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWafAttackEventRequest.class, ListWafAttackEventResponse.class)
                .withName("ListWafAttackEvent")
                .withUri("/v2/aad/domains/waf-info/attack/event")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafAttackEventRequest::getDomains, ListWafAttackEventRequest::setDomains));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafAttackEventRequest::getStartTime, ListWafAttackEventRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafAttackEventRequest::getEndTime, ListWafAttackEventRequest::setEndTime));
        builder.<String>withRequestField("recent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafAttackEventRequest::getRecent, ListWafAttackEventRequest::setRecent));
        builder.<Integer>withRequestField("overseas_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWafAttackEventRequest::getOverseasType,
                ListWafAttackEventRequest::setOverseasType));
        builder.<String>withRequestField("sip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafAttackEventRequest::getSip, ListWafAttackEventRequest::setSip));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWafAttackEventRequest::getLimit, ListWafAttackEventRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWafAttackEventRequest::getOffset, ListWafAttackEventRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWafBandwidthRequest, ListWafBandwidthResponse> listWafBandwidth =
        genForListWafBandwidth();

    private static HttpRequestDef<ListWafBandwidthRequest, ListWafBandwidthResponse> genForListWafBandwidth() {
        // basic
        HttpRequestDef.Builder<ListWafBandwidthRequest, ListWafBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWafBandwidthRequest.class, ListWafBandwidthResponse.class)
                .withName("ListWafBandwidth")
                .withUri("/v2/aad/domains/waf-info/flow/bandwidth")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafBandwidthRequest::getDomains, ListWafBandwidthRequest::setDomains));
        builder.<String>withRequestField("value_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafBandwidthRequest::getValueType, ListWafBandwidthRequest::setValueType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafBandwidthRequest::getStartTime, ListWafBandwidthRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafBandwidthRequest::getEndTime, ListWafBandwidthRequest::setEndTime));
        builder.<String>withRequestField("recent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafBandwidthRequest::getRecent, ListWafBandwidthRequest::setRecent));
        builder.<Integer>withRequestField("overseas_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWafBandwidthRequest::getOverseasType, ListWafBandwidthRequest::setOverseasType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWafCustomRuleRequest, ListWafCustomRuleResponse> listWafCustomRule =
        genForListWafCustomRule();

    private static HttpRequestDef<ListWafCustomRuleRequest, ListWafCustomRuleResponse> genForListWafCustomRule() {
        // basic
        HttpRequestDef.Builder<ListWafCustomRuleRequest, ListWafCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWafCustomRuleRequest.class, ListWafCustomRuleResponse.class)
                .withName("ListWafCustomRule")
                .withUri("/v2/aad/policies/waf/custom-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafCustomRuleRequest::getDomainName, ListWafCustomRuleRequest::setDomainName));
        builder.<Integer>withRequestField("overseas_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWafCustomRuleRequest::getOverseasType,
                ListWafCustomRuleRequest::setOverseasType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWafGeoIpRuleRequest, ListWafGeoIpRuleResponse> listWafGeoIpRule =
        genForListWafGeoIpRule();

    private static HttpRequestDef<ListWafGeoIpRuleRequest, ListWafGeoIpRuleResponse> genForListWafGeoIpRule() {
        // basic
        HttpRequestDef.Builder<ListWafGeoIpRuleRequest, ListWafGeoIpRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWafGeoIpRuleRequest.class, ListWafGeoIpRuleResponse.class)
                .withName("ListWafGeoIpRule")
                .withUri("/v2/aad/policies/waf/geoip-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafGeoIpRuleRequest::getDomainName, ListWafGeoIpRuleRequest::setDomainName));
        builder.<Integer>withRequestField("overseas_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWafGeoIpRuleRequest::getOverseasType, ListWafGeoIpRuleRequest::setOverseasType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWafQpsRequest, ListWafQpsResponse> listWafQps = genForListWafQps();

    private static HttpRequestDef<ListWafQpsRequest, ListWafQpsResponse> genForListWafQps() {
        // basic
        HttpRequestDef.Builder<ListWafQpsRequest, ListWafQpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWafQpsRequest.class, ListWafQpsResponse.class)
                .withName("ListWafQps")
                .withUri("/v2/aad/domains/waf-info/flow/qps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafQpsRequest::getDomains, ListWafQpsRequest::setDomains));
        builder.<String>withRequestField("value_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafQpsRequest::getValueType, ListWafQpsRequest::setValueType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafQpsRequest::getStartTime, ListWafQpsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafQpsRequest::getEndTime, ListWafQpsRequest::setEndTime));
        builder.<String>withRequestField("recent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafQpsRequest::getRecent, ListWafQpsRequest::setRecent));
        builder.<Integer>withRequestField("overseas_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWafQpsRequest::getOverseasType, ListWafQpsRequest::setOverseasType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWafWhiteIpRuleRequest, ListWafWhiteIpRuleResponse> listWafWhiteIpRule =
        genForListWafWhiteIpRule();

    private static HttpRequestDef<ListWafWhiteIpRuleRequest, ListWafWhiteIpRuleResponse> genForListWafWhiteIpRule() {
        // basic
        HttpRequestDef.Builder<ListWafWhiteIpRuleRequest, ListWafWhiteIpRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWafWhiteIpRuleRequest.class, ListWafWhiteIpRuleResponse.class)
                .withName("ListWafWhiteIpRule")
                .withUri("/v2/aad/policies/waf/blackwhite-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWafWhiteIpRuleRequest::getDomainName, ListWafWhiteIpRuleRequest::setDomainName));
        builder.<Integer>withRequestField("overseas_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWafWhiteIpRuleRequest::getOverseasType,
                ListWafWhiteIpRuleRequest::setOverseasType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhiteBlackIpRuleRequest, ListWhiteBlackIpRuleResponse> listWhiteBlackIpRule =
        genForListWhiteBlackIpRule();

    private static HttpRequestDef<ListWhiteBlackIpRuleRequest, ListWhiteBlackIpRuleResponse> genForListWhiteBlackIpRule() {
        // basic
        HttpRequestDef.Builder<ListWhiteBlackIpRuleRequest, ListWhiteBlackIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWhiteBlackIpRuleRequest.class, ListWhiteBlackIpRuleResponse.class)
            .withName("ListWhiteBlackIpRule")
            .withUri("/v2/aad/policies/ddos/blackwhite-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteBlackIpRuleRequest::getType, ListWhiteBlackIpRuleRequest::setType));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteBlackIpRuleRequest::getInstanceId,
                ListWhiteBlackIpRuleRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainCertificateRequest, ShowDomainCertificateResponse> showDomainCertificate =
        genForShowDomainCertificate();

    private static HttpRequestDef<ShowDomainCertificateRequest, ShowDomainCertificateResponse> genForShowDomainCertificate() {
        // basic
        HttpRequestDef.Builder<ShowDomainCertificateRequest, ShowDomainCertificateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainCertificateRequest.class, ShowDomainCertificateResponse.class)
            .withName("ShowDomainCertificate")
            .withUri("/v2/aad/domains/{domain_id}/certificate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainCertificateRequest::getDomainId,
                ShowDomainCertificateRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowBlockRequest, ShowFlowBlockResponse> showFlowBlock =
        genForShowFlowBlock();

    private static HttpRequestDef<ShowFlowBlockRequest, ShowFlowBlockResponse> genForShowFlowBlock() {
        // basic
        HttpRequestDef.Builder<ShowFlowBlockRequest, ShowFlowBlockResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlowBlockRequest.class, ShowFlowBlockResponse.class)
                .withName("ShowFlowBlock")
                .withUri("/v2/aad/policies/ddos/flow-block")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlowBlockRequest::getInstanceId, ShowFlowBlockRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWafPolicyRequest, ShowWafPolicyResponse> showWafPolicy =
        genForShowWafPolicy();

    private static HttpRequestDef<ShowWafPolicyRequest, ShowWafPolicyResponse> genForShowWafPolicy() {
        // basic
        HttpRequestDef.Builder<ShowWafPolicyRequest, ShowWafPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWafPolicyRequest.class, ShowWafPolicyResponse.class)
                .withName("ShowWafPolicy")
                .withUri("/v2/aad/policies/waf")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWafPolicyRequest::getDomainName, ShowWafPolicyRequest::setDomainName));
        builder.<Integer>withRequestField("overseas_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWafPolicyRequest::getOverseasType, ShowWafPolicyRequest::setOverseasType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWafQpsRequest, ShowWafQpsResponse> showWafQps = genForShowWafQps();

    private static HttpRequestDef<ShowWafQpsRequest, ShowWafQpsResponse> genForShowWafQps() {
        // basic
        HttpRequestDef.Builder<ShowWafQpsRequest, ShowWafQpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWafQpsRequest.class, ShowWafQpsResponse.class)
                .withName("ShowWafQps")
                .withUri("/v2/aad/domains/waf-info/flow/request/peak")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("recent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWafQpsRequest::getRecent, ShowWafQpsRequest::setRecent));
        builder.<String>withRequestField("domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWafQpsRequest::getDomains, ShowWafQpsRequest::setDomains));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWafQpsRequest::getStartTime, ShowWafQpsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWafQpsRequest::getEndTime, ShowWafQpsRequest::setEndTime));
        builder.<Integer>withRequestField("overseas_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWafQpsRequest::getOverseasType, ShowWafQpsRequest::setOverseasType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeInstanceSpecRequest, UpgradeInstanceSpecResponse> upgradeInstanceSpec =
        genForUpgradeInstanceSpec();

    private static HttpRequestDef<UpgradeInstanceSpecRequest, UpgradeInstanceSpecResponse> genForUpgradeInstanceSpec() {
        // basic
        HttpRequestDef.Builder<UpgradeInstanceSpecRequest, UpgradeInstanceSpecResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpgradeInstanceSpecRequest.class, UpgradeInstanceSpecResponse.class)
                .withName("UpgradeInstanceSpec")
                .withUri("/v2/aad/instance")
                .withContentType("application/json");

        // requests
        builder.<UpgradeInstanceSpecV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeInstanceSpecV2RequestBody.class),
            f -> f.withMarshaller(UpgradeInstanceSpecRequest::getBody, UpgradeInstanceSpecRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genForDeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genForDeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v2/aad/domains")
                .withContentType("application/json");

        // requests
        builder.<DeleteDomainV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDomainV2RequestBody.class),
            f -> f.withMarshaller(DeleteDomainRequest::getBody, DeleteDomainRequest::setBody));

        // response

        return builder.build();
    }

}
