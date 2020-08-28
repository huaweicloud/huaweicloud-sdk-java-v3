package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.elb.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class ElbMeta {

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate = genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withUri("/v3/{project_id}/elb/certificates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateCertificateRequestBody.class,
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitor = genForcreateHealthMonitor();

    private static HttpRequestDef<CreateHealthMonitorRequest, CreateHealthMonitorResponse> genForcreateHealthMonitor() {
        // basic
        HttpRequestDef.Builder<CreateHealthMonitorRequest, CreateHealthMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHealthMonitorRequest.class, CreateHealthMonitorResponse.class)
                .withUri("/v3/{project_id}/elb/healthmonitors")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateHealthMonitorRequestBody.class,
            f -> f.withMarshaller(CreateHealthMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7Policy = genForcreateL7Policy();

    private static HttpRequestDef<CreateL7PolicyRequest, CreateL7PolicyResponse> genForcreateL7Policy() {
        // basic
        HttpRequestDef.Builder<CreateL7PolicyRequest, CreateL7PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateL7PolicyRequest.class, CreateL7PolicyResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateL7PolicyRequestBody.class,
            f -> f.withMarshaller(CreateL7PolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7RuleRequest, CreateL7RuleResponse> createL7Rule = genForcreateL7Rule();

    private static HttpRequestDef<CreateL7RuleRequest, CreateL7RuleResponse> genForcreateL7Rule() {
        // basic
        HttpRequestDef.Builder<CreateL7RuleRequest, CreateL7RuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateL7RuleRequest.class, CreateL7RuleResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateL7RuleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateL7RuleRequestBody.class,
            f -> f.withMarshaller(CreateL7RuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerRequest, CreateListenerResponse> createListener = genForcreateListener();

    private static HttpRequestDef<CreateListenerRequest, CreateListenerResponse> genForcreateListener() {
        // basic
        HttpRequestDef.Builder<CreateListenerRequest, CreateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateListenerRequest.class, CreateListenerResponse.class)
                .withUri("/v3/{project_id}/elb/listeners")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateListenerRequestBody.class,
            f -> f.withMarshaller(CreateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancer = genForcreateLoadBalancer();

    private static HttpRequestDef<CreateLoadBalancerRequest, CreateLoadBalancerResponse> genForcreateLoadBalancer() {
        // basic
        HttpRequestDef.Builder<CreateLoadBalancerRequest, CreateLoadBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLoadBalancerRequest.class, CreateLoadBalancerResponse.class)
                .withUri("/v3/{project_id}/elb/loadbalancers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("X-Auth-Project-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLoadBalancerRequest::getXAuthProjectToken, (req, v) -> {
                req.setXAuthProjectToken(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateLoadBalancerRequestBody.class,
            f -> f.withMarshaller(CreateLoadBalancerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberRequest, CreateMemberResponse> createMember = genForcreateMember();

    private static HttpRequestDef<CreateMemberRequest, CreateMemberResponse> genForcreateMember() {
        // basic
        HttpRequestDef.Builder<CreateMemberRequest, CreateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMemberRequest.class, CreateMemberResponse.class)
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateMemberRequestBody.class,
            f -> f.withMarshaller(CreateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolRequest, CreatePoolResponse> createPool = genForcreatePool();

    private static HttpRequestDef<CreatePoolRequest, CreatePoolResponse> genForcreatePool() {
        // basic
        HttpRequestDef.Builder<CreatePoolRequest, CreatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePoolRequest.class, CreatePoolResponse.class)
                .withUri("/v3/{project_id}/elb/pools")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePoolRequestBody.class,
            f -> f.withMarshaller(CreatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate = genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withUri("/v3/{project_id}/elb/certificates/{certificate_id}");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitor = genFordeleteHealthMonitor();

    private static HttpRequestDef<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> genFordeleteHealthMonitor() {
        // basic
        HttpRequestDef.Builder<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHealthMonitorRequest.class, DeleteHealthMonitorResponse.class)
                .withUri("/v3/{project_id}/elb/healthmonitors/{healthmonitor_id}");

        // requests
        builder.withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteHealthMonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7Policy = genFordeleteL7Policy();

    private static HttpRequestDef<DeleteL7PolicyRequest, DeleteL7PolicyResponse> genFordeleteL7Policy() {
        // basic
        HttpRequestDef.Builder<DeleteL7PolicyRequest, DeleteL7PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteL7PolicyRequest.class, DeleteL7PolicyResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteL7PolicyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7Rule = genFordeleteL7Rule();

    private static HttpRequestDef<DeleteL7RuleRequest, DeleteL7RuleResponse> genFordeleteL7Rule() {
        // basic
        HttpRequestDef.Builder<DeleteL7RuleRequest, DeleteL7RuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteL7RuleRequest.class, DeleteL7RuleResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteL7RuleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteL7RuleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> deleteListener = genFordeleteListener();

    private static HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> genFordeleteListener() {
        // basic
        HttpRequestDef.Builder<DeleteListenerRequest, DeleteListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteListenerRequest.class, DeleteListenerResponse.class)
                .withUri("/v3/{project_id}/elb/listeners/{listener_id}");

        // requests
        builder.withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancer = genFordeleteLoadBalancer();

    private static HttpRequestDef<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> genFordeleteLoadBalancer() {
        // basic
        HttpRequestDef.Builder<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLoadBalancerRequest.class, DeleteLoadBalancerResponse.class)
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}");

        // requests
        builder.withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteLoadBalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genFordeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genFordeleteMember() {
        // basic
        HttpRequestDef.Builder<DeleteMemberRequest, DeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberRequest.class, DeleteMemberResponse.class)
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/{member_id}");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolRequest, DeletePoolResponse> deletePool = genFordeletePool();

    private static HttpRequestDef<DeletePoolRequest, DeletePoolResponse> genFordeletePool() {
        // basic
        HttpRequestDef.Builder<DeletePoolRequest, DeletePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePoolRequest.class, DeletePoolResponse.class)
                .withUri("/v3/{project_id}/elb/pools/{pool_id}");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones = genForlistAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForlistAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
                .withUri("/v3/{project_id}/elb/availability-zones");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates = genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withUri("/v3/{project_id}/elb/certificates");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListCertificatesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListCertificatesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withUri("/v3/{project_id}/elb/flavors");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListFlavorsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("shared",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListFlavorsRequest::getShared, (req, v) -> {
                req.setShared(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitors = genForlistHealthMonitors();

    private static HttpRequestDef<ListHealthMonitorsRequest, ListHealthMonitorsResponse> genForlistHealthMonitors() {
        // basic
        HttpRequestDef.Builder<ListHealthMonitorsRequest, ListHealthMonitorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHealthMonitorsRequest.class, ListHealthMonitorsResponse.class)
                .withUri("/v3/{project_id}/elb/healthmonitors");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("monitor_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMonitorPort, (req, v) -> {
                req.setMonitorPort(v);
            })
        );
        builder.withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("delay",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getDelay, (req, v) -> {
                req.setDelay(v);
            })
        );
        builder.withRequestField("max_retries",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getMaxRetries, (req, v) -> {
                req.setMaxRetries(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getTimeout, (req, v) -> {
                req.setTimeout(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("expected_codes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getExpectedCodes, (req, v) -> {
                req.setExpectedCodes(v);
            })
        );
        builder.withRequestField("url_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getUrlPath, (req, v) -> {
                req.setUrlPath(v);
            })
        );
        builder.withRequestField("http_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getHttpMethod, (req, v) -> {
                req.setHttpMethod(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthMonitorsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7Policies = genForlistL7Policies();

    private static HttpRequestDef<ListL7PoliciesRequest, ListL7PoliciesResponse> genForlistL7Policies() {
        // basic
        HttpRequestDef.Builder<ListL7PoliciesRequest, ListL7PoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListL7PoliciesRequest.class, ListL7PoliciesResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );
        builder.withRequestField("position",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getPosition, (req, v) -> {
                req.setPosition(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.withRequestField("redirect_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectUrl, (req, v) -> {
                req.setRedirectUrl(v);
            })
        );
        builder.withRequestField("redirect_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectPoolId, (req, v) -> {
                req.setRedirectPoolId(v);
            })
        );
        builder.withRequestField("redirect_listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getRedirectListenerId, (req, v) -> {
                req.setRedirectListenerId(v);
            })
        );
        builder.withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            })
        );
        builder.withRequestField("display_all_rules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7PoliciesRequest::getDisplayAllRules, (req, v) -> {
                req.setDisplayAllRules(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7RulesRequest, ListL7RulesResponse> listL7Rules = genForlistL7Rules();

    private static HttpRequestDef<ListL7RulesRequest, ListL7RulesResponse> genForlistL7Rules() {
        // basic
        HttpRequestDef.Builder<ListL7RulesRequest, ListL7RulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListL7RulesRequest.class, ListL7RulesResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListL7RulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7RulesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getCompareType, (req, v) -> {
                req.setCompareType(v);
            })
        );
        builder.withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            })
        );
        builder.withRequestField("invert",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7RulesRequest::getInvert, (req, v) -> {
                req.setInvert(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7RulesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getValue, (req, v) -> {
                req.setValue(v);
            })
        );
        builder.withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7RulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersRequest, ListListenersResponse> listListeners = genForlistListeners();

    private static HttpRequestDef<ListListenersRequest, ListListenersResponse> genForlistListeners() {
        // basic
        HttpRequestDef.Builder<ListListenersRequest, ListListenersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListListenersRequest.class, ListListenersResponse.class)
                .withUri("/v3/{project_id}/elb/listeners");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListListenersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            })
        );
        builder.withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("default_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getDefaultTlsContainerRef, (req, v) -> {
                req.setDefaultTlsContainerRef(v);
            })
        );
        builder.withRequestField("client_ca_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getClientCaTlsContainerRef, (req, v) -> {
                req.setClientCaTlsContainerRef(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListListenersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("connection_limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getConnectionLimit, (req, v) -> {
                req.setConnectionLimit(v);
            })
        );
        builder.withRequestField("default_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getDefaultPoolId, (req, v) -> {
                req.setDefaultPoolId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("http2_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListListenersRequest::getHttp2Enable, (req, v) -> {
                req.setHttp2Enable(v);
            })
        );
        builder.withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );
        builder.withRequestField("tls_ciphers_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getTlsCiphersPolicy, (req, v) -> {
                req.setTlsCiphersPolicy(v);
            })
        );
        builder.withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            })
        );
        builder.withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("enable_member_retry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListListenersRequest::getEnableMemberRetry, (req, v) -> {
                req.setEnableMemberRetry(v);
            })
        );
        builder.withRequestField("member_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getMemberTimeout, (req, v) -> {
                req.setMemberTimeout(v);
            })
        );
        builder.withRequestField("client_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getClientTimeout, (req, v) -> {
                req.setClientTimeout(v);
            })
        );
        builder.withRequestField("keepalive_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getKeepaliveTimeout, (req, v) -> {
                req.setKeepaliveTimeout(v);
            })
        );
        builder.withRequestField("transparent_client_ip_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListListenersRequest::getTransparentClientIpEnable, (req, v) -> {
                req.setTransparentClientIpEnable(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancers = genForlistLoadBalancers();

    private static HttpRequestDef<ListLoadBalancersRequest, ListLoadBalancersResponse> genForlistLoadBalancers() {
        // basic
        HttpRequestDef.Builder<ListLoadBalancersRequest, ListLoadBalancersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoadBalancersRequest.class, ListLoadBalancersResponse.class)
                .withUri("/v3/{project_id}/elb/loadbalancers");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            })
        );
        builder.withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getOperatingStatus, (req, v) -> {
                req.setOperatingStatus(v);
            })
        );
        builder.withRequestField("guaranteed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getGuaranteed, (req, v) -> {
                req.setGuaranteed(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipPortId, (req, v) -> {
                req.setVipPortId(v);
            })
        );
        builder.withRequestField("vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipAddress, (req, v) -> {
                req.setVipAddress(v);
            })
        );
        builder.withRequestField("vip_subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getVipSubnetCidrId, (req, v) -> {
                req.setVipSubnetCidrId(v);
            })
        );
        builder.withRequestField("l4_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getL4FlavorId, (req, v) -> {
                req.setL4FlavorId(v);
            })
        );
        builder.withRequestField("l4_scale_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getL4ScaleFlavorId, (req, v) -> {
                req.setL4ScaleFlavorId(v);
            })
        );
        builder.withRequestField("ipv6_vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipAddress, (req, v) -> {
                req.setIpv6VipAddress(v);
            })
        );
        builder.withRequestField("ipv6_vip_virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipVirsubnetId, (req, v) -> {
                req.setIpv6VipVirsubnetId(v);
            })
        );
        builder.withRequestField("ipv6_vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpv6VipPortId, (req, v) -> {
                req.setIpv6VipPortId(v);
            })
        );
        builder.withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.withRequestField("availability_zone_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getAvailabilityZoneList, (req, v) -> {
                req.setAvailabilityZoneList(v);
            })
        );
        builder.withRequestField("eips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getEips, (req, v) -> {
                req.setEips(v);
            })
        );
        builder.withRequestField("l7_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getL7FlavorId, (req, v) -> {
                req.setL7FlavorId(v);
            })
        );
        builder.withRequestField("l7_scale_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getL7ScaleFlavorId, (req, v) -> {
                req.setL7ScaleFlavorId(v);
            })
        );
        builder.withRequestField("billing_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getBillingInfo, (req, v) -> {
                req.setBillingInfo(v);
            })
        );
        builder.withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            })
        );
        builder.withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("tags-any",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getTagsAny, (req, v) -> {
                req.setTagsAny(v);
            })
        );
        builder.withRequestField("not-tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getNotTags, (req, v) -> {
                req.setNotTags(v);
            })
        );
        builder.withRequestField("not-tags-any",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getNotTagsAny, (req, v) -> {
                req.setNotTagsAny(v);
            })
        );
        builder.withRequestField("publicips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getPublicips, (req, v) -> {
                req.setPublicips(v);
            })
        );
        builder.withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            })
        );
        builder.withRequestField("deletion_protection_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListLoadBalancersRequest::getDeletionProtectionEnable, (req, v) -> {
                req.setDeletionProtectionEnable(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMembersRequest, ListMembersResponse> listMembers = genForlistMembers();

    private static HttpRequestDef<ListMembersRequest, ListMembersResponse> genForlistMembers() {
        // basic
        HttpRequestDef.Builder<ListMembersRequest, ListMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMembersRequest.class, ListMembersResponse.class)
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMembersRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMembersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMembersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListMembersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMembersRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("weight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMembersRequest::getWeight, (req, v) -> {
                req.setWeight(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListMembersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("subnet_cidr_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMembersRequest::getSubnetCidrId, (req, v) -> {
                req.setSubnetCidrId(v);
            })
        );
        builder.withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMembersRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            })
        );
        builder.withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMembersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMembersRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMembersRequest::getOperatingStatus, (req, v) -> {
                req.setOperatingStatus(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMembersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForlistPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForlistPools() {
        // basic
        HttpRequestDef.Builder<ListPoolsRequest, ListPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolsRequest.class, ListPoolsResponse.class)
                .withUri("/v3/{project_id}/elb/pools");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListPoolsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListPoolsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("healthmonitor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );
        builder.withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            })
        );
        builder.withRequestField("lb_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getLbAlgorithm, (req, v) -> {
                req.setLbAlgorithm(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            })
        );
        builder.withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            })
        );
        builder.withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            })
        );
        builder.withRequestField("member_deletion_protection_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeletionProtectionEnable, (req, v) -> {
                req.setMemberDeletionProtectionEnable(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate = genForshowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForshowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withUri("/v3/{project_id}/elb/certificates/{certificate_id}");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlavorRequest, ShowFlavorResponse> showFlavor = genForshowFlavor();

    private static HttpRequestDef<ShowFlavorRequest, ShowFlavorResponse> genForshowFlavor() {
        // basic
        HttpRequestDef.Builder<ShowFlavorRequest, ShowFlavorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlavorRequest.class, ShowFlavorResponse.class)
                .withUri("/v3/{project_id}/elb/flavors/{flavor_id}");

        // requests
        builder.withRequestField("flavor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowFlavorRequest::getFlavorId, (req, v) -> {
                req.setFlavorId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitor = genForshowHealthMonitor();

    private static HttpRequestDef<ShowHealthMonitorRequest, ShowHealthMonitorResponse> genForshowHealthMonitor() {
        // basic
        HttpRequestDef.Builder<ShowHealthMonitorRequest, ShowHealthMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHealthMonitorRequest.class, ShowHealthMonitorResponse.class)
                .withUri("/v3/{project_id}/elb/healthmonitors/{healthmonitor_id}");

        // requests
        builder.withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowHealthMonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7Policy = genForshowL7Policy();

    private static HttpRequestDef<ShowL7PolicyRequest, ShowL7PolicyResponse> genForshowL7Policy() {
        // basic
        HttpRequestDef.Builder<ShowL7PolicyRequest, ShowL7PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowL7PolicyRequest.class, ShowL7PolicyResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowL7PolicyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7RuleRequest, ShowL7RuleResponse> showL7Rule = genForshowL7Rule();

    private static HttpRequestDef<ShowL7RuleRequest, ShowL7RuleResponse> genForshowL7Rule() {
        // basic
        HttpRequestDef.Builder<ShowL7RuleRequest, ShowL7RuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowL7RuleRequest.class, ShowL7RuleResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowL7RuleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowL7RuleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerRequest, ShowListenerResponse> showListener = genForshowListener();

    private static HttpRequestDef<ShowListenerRequest, ShowListenerResponse> genForshowListener() {
        // basic
        HttpRequestDef.Builder<ShowListenerRequest, ShowListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListenerRequest.class, ShowListenerResponse.class)
                .withUri("/v3/{project_id}/elb/listeners/{listener_id}");

        // requests
        builder.withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancer = genForshowLoadBalancer();

    private static HttpRequestDef<ShowLoadBalancerRequest, ShowLoadBalancerResponse> genForshowLoadBalancer() {
        // basic
        HttpRequestDef.Builder<ShowLoadBalancerRequest, ShowLoadBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoadBalancerRequest.class, ShowLoadBalancerResponse.class)
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}");

        // requests
        builder.withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowLoadBalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatus = genForshowLoadBalancerStatus();

    private static HttpRequestDef<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> genForshowLoadBalancerStatus() {
        // basic
        HttpRequestDef.Builder<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoadBalancerStatusRequest.class, ShowLoadBalancerStatusResponse.class)
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/statuses");

        // requests
        builder.withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowLoadBalancerStatusRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberRequest, ShowMemberResponse> showMember = genForshowMember();

    private static HttpRequestDef<ShowMemberRequest, ShowMemberResponse> genForshowMember() {
        // basic
        HttpRequestDef.Builder<ShowMemberRequest, ShowMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMemberRequest.class, ShowMemberResponse.class)
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/{member_id}");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForshowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForshowPool() {
        // basic
        HttpRequestDef.Builder<ShowPoolRequest, ShowPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolRequest.class, ShowPoolResponse.class)
                .withUri("/v3/{project_id}/elb/pools/{pool_id}");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForshowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForshowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withUri("/v3/{project_id}/elb/quotas");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse> showQuotaDefaults = genForshowQuotaDefaults();

    private static HttpRequestDef<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse> genForshowQuotaDefaults() {
        // basic
        HttpRequestDef.Builder<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaDefaultsRequest.class, ShowQuotaDefaultsResponse.class)
                .withUri("/v3/{project_id}/elb/quotas/defaults");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate = genForupdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForupdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withUri("/v3/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateCertificateRequestBody.class,
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitor = genForupdateHealthMonitor();

    private static HttpRequestDef<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> genForupdateHealthMonitor() {
        // basic
        HttpRequestDef.Builder<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHealthMonitorRequest.class, UpdateHealthMonitorResponse.class)
                .withUri("/v3/{project_id}/elb/healthmonitors/{healthmonitor_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateHealthMonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateHealthMonitorRequestBody.class,
            f -> f.withMarshaller(UpdateHealthMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7Policy = genForupdateL7Policy();

    private static HttpRequestDef<UpdateL7PolicyRequest, UpdateL7PolicyResponse> genForupdateL7Policy() {
        // basic
        HttpRequestDef.Builder<UpdateL7PolicyRequest, UpdateL7PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateL7PolicyRequest.class, UpdateL7PolicyResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateL7PolicyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateL7PolicyRequestBody.class,
            f -> f.withMarshaller(UpdateL7PolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7Rule = genForupdateL7Rule();

    private static HttpRequestDef<UpdateL7RuleRequest, UpdateL7RuleResponse> genForupdateL7Rule() {
        // basic
        HttpRequestDef.Builder<UpdateL7RuleRequest, UpdateL7RuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateL7RuleRequest.class, UpdateL7RuleResponse.class)
                .withUri("/v3/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateL7RuleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateL7RuleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateL7RuleRequestBody.class,
            f -> f.withMarshaller(UpdateL7RuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> updateListener = genForupdateListener();

    private static HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> genForupdateListener() {
        // basic
        HttpRequestDef.Builder<UpdateListenerRequest, UpdateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateListenerRequest.class, UpdateListenerResponse.class)
                .withUri("/v3/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateListenerRequestBody.class,
            f -> f.withMarshaller(UpdateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancer = genForupdateLoadBalancer();

    private static HttpRequestDef<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> genForupdateLoadBalancer() {
        // basic
        HttpRequestDef.Builder<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLoadBalancerRequest.class, UpdateLoadBalancerResponse.class)
                .withUri("/v3/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateLoadBalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateLoadBalancerRequestBody.class,
            f -> f.withMarshaller(UpdateLoadBalancerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForupdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForupdateMember() {
        // basic
        HttpRequestDef.Builder<UpdateMemberRequest, UpdateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberRequest.class, UpdateMemberResponse.class)
                .withUri("/v3/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateMemberRequestBody.class,
            f -> f.withMarshaller(UpdateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> updatePool = genForupdatePool();

    private static HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> genForupdatePool() {
        // basic
        HttpRequestDef.Builder<UpdatePoolRequest, UpdatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePoolRequest.class, UpdatePoolResponse.class)
                .withUri("/v3/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePoolRequestBody.class,
            f -> f.withMarshaller(UpdatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNum = genForcountPreoccupyIpNum();

    private static HttpRequestDef<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> genForcountPreoccupyIpNum() {
        // basic
        HttpRequestDef.Builder<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountPreoccupyIpNumRequest.class, CountPreoccupyIpNumResponse.class)
                .withUri("/v3/{project_id}/elb/preoccupy-ip-num");

        // requests
        builder.withRequestField("l7_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getL7FlavorId, (req, v) -> {
                req.setL7FlavorId(v);
            })
        );
        builder.withRequestField("ip_target_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getIpTargetEnable, (req, v) -> {
                req.setIpTargetEnable(v);
            })
        );
        builder.withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            })
        );
        builder.withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );
        builder.withRequestField("availability_zone_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CountPreoccupyIpNumRequest::getAvailabilityZoneNumber, (req, v) -> {
                req.setAvailabilityZoneNumber(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroup = genForcreateIpGroup();

    private static HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> genForcreateIpGroup() {
        // basic
        HttpRequestDef.Builder<CreateIpGroupRequest, CreateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIpGroupRequest.class, CreateIpGroupResponse.class)
                .withUri("/v3/{project_id}/elb/ipgroups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateIpGroupRequestBody.class,
            f -> f.withMarshaller(CreateIpGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroup = genFordeleteIpGroup();

    private static HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> genFordeleteIpGroup() {
        // basic
        HttpRequestDef.Builder<DeleteIpGroupRequest, DeleteIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIpGroupRequest.class, DeleteIpGroupResponse.class)
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}");

        // requests
        builder.withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteIpGroupRequest::getIpgroupId, (req, v) -> {
                req.setIpgroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroups = genForlistIpGroups();

    private static HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> genForlistIpGroups() {
        // basic
        HttpRequestDef.Builder<ListIpGroupsRequest, ListIpGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpGroupsRequest.class, ListIpGroupsResponse.class)
                .withUri("/v3/{project_id}/elb/ipgroups");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIpGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIpGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListIpGroupsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIpGroupsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIpGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIpGroupsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("ip_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIpGroupsRequest::getIpList, (req, v) -> {
                req.setIpList(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroup = genForshowIpGroup();

    private static HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> genForshowIpGroup() {
        // basic
        HttpRequestDef.Builder<ShowIpGroupRequest, ShowIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpGroupRequest.class, ShowIpGroupResponse.class)
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}");

        // requests
        builder.withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowIpGroupRequest::getIpgroupId, (req, v) -> {
                req.setIpgroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroup = genForupdateIpGroup();

    private static HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> genForupdateIpGroup() {
        // basic
        HttpRequestDef.Builder<UpdateIpGroupRequest, UpdateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpGroupRequest.class, UpdateIpGroupResponse.class)
                .withUri("/v3/{project_id}/elb/ipgroups/{ipgroup_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("ipgroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateIpGroupRequest::getIpgroupId, (req, v) -> {
                req.setIpgroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateIpGroupRequestBody.class,
            f -> f.withMarshaller(UpdateIpGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
