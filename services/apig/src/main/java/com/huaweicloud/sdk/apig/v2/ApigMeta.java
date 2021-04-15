package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.apig.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class ApigMeta {

    public static final HttpRequestDef<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2 = genForassociateCertificateV2();

    private static HttpRequestDef<AssociateCertificateV2Request, AssociateCertificateV2Response> genForassociateCertificateV2() {
        // basic
        HttpRequestDef.Builder<AssociateCertificateV2Request, AssociateCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateCertificateV2Request.class, AssociateCertificateV2Response.class)
                .withName("AssociateCertificateV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DomainCertReq.class,
            f -> f.withMarshaller(AssociateCertificateV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2 = genForassociateDomainV2();

    private static HttpRequestDef<AssociateDomainV2Request, AssociateDomainV2Response> genForassociateDomainV2() {
        // basic
        HttpRequestDef.Builder<AssociateDomainV2Request, AssociateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateDomainV2Request.class, AssociateDomainV2Response.class)
                .withName("AssociateDomainV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateDomainV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateDomainV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DomainReq.class,
            f -> f.withMarshaller(AssociateDomainV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2 = genForassociateSignatureKeyV2();

    private static HttpRequestDef<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> genForassociateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateSignatureKeyV2Request.class, AssociateSignatureKeyV2Response.class)
                .withName("AssociateSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SignBindingReq.class,
            f -> f.withMarshaller(AssociateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2 = genForcreateEnvironmentV2();

    private static HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> genForcreateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentV2Request, CreateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentV2Request.class, CreateEnvironmentV2Response.class)
                .withName("CreateEnvironmentV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnvReq.class,
            f -> f.withMarshaller(CreateEnvironmentV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2 = genForcreateEnvironmentVariableV2();

    private static HttpRequestDef<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> genForcreateEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentVariableV2Request.class, CreateEnvironmentVariableV2Response.class)
                .withName("CreateEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnvVariableReq.class,
            f -> f.withMarshaller(CreateEnvironmentVariableV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2 = genForcreateRequestThrottlingPolicyV2();

    private static HttpRequestDef<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> genForcreateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRequestThrottlingPolicyV2Request.class, CreateRequestThrottlingPolicyV2Response.class)
                .withName("CreateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleReq.class,
            f -> f.withMarshaller(CreateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2 = genForcreateSignatureKeyV2();

    private static HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> genForcreateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSignatureKeyV2Request.class, CreateSignatureKeyV2Response.class)
                .withName("CreateSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SignatureReq.class,
            f -> f.withMarshaller(CreateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2 = genForcreateSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> genForcreateSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSpecialThrottlingConfigurationV2Request.class, CreateSpecialThrottlingConfigurationV2Response.class)
                .withName("CreateSpecialThrottlingConfigurationV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleSpecialReq.class,
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2 = genFordeleteEnvironmentV2();

    private static HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> genFordeleteEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvironmentV2Request.class, DeleteEnvironmentV2Response.class)
                .withName("DeleteEnvironmentV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs/{env_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEnvironmentV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2 = genFordeleteEnvironmentVariableV2();

    private static HttpRequestDef<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> genFordeleteEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvironmentVariableV2Request.class, DeleteEnvironmentVariableV2Response.class)
                .withName("DeleteEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEnvironmentVariableV2Request::getEnvVariableId, (req, v) -> {
                req.setEnvVariableId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2 = genFordeleteRequestThrottlingPolicyV2();

    private static HttpRequestDef<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> genFordeleteRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRequestThrottlingPolicyV2Request.class, DeleteRequestThrottlingPolicyV2Response.class)
                .withName("DeleteRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2 = genFordeleteSignatureKeyV2();

    private static HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> genFordeleteSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSignatureKeyV2Request.class, DeleteSignatureKeyV2Response.class)
                .withName("DeleteSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs/{sign_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2 = genFordeleteSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> genFordeleteSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSpecialThrottlingConfigurationV2Request.class, DeleteSpecialThrottlingConfigurationV2Response.class)
                .withName("DeleteSpecialThrottlingConfigurationV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("strategy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getStrategyId, (req, v) -> {
                req.setStrategyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2 = genFordisassociateCertificateV2();

    private static HttpRequestDef<DisassociateCertificateV2Request, DisassociateCertificateV2Response> genFordisassociateCertificateV2() {
        // basic
        HttpRequestDef.Builder<DisassociateCertificateV2Request, DisassociateCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateCertificateV2Request.class, DisassociateCertificateV2Response.class)
                .withName("DisassociateCertificateV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2 = genFordisassociateDomainV2();

    private static HttpRequestDef<DisassociateDomainV2Request, DisassociateDomainV2Response> genFordisassociateDomainV2() {
        // basic
        HttpRequestDef.Builder<DisassociateDomainV2Request, DisassociateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateDomainV2Request.class, DisassociateDomainV2Response.class)
                .withName("DisassociateDomainV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateDomainV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateDomainV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateDomainV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2 = genFordisassociateSignatureKeyV2();

    private static HttpRequestDef<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> genFordisassociateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateSignatureKeyV2Request.class, DisassociateSignatureKeyV2Response.class)
                .withName("DisassociateSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/{sign_bindings_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_bindings_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateSignatureKeyV2Request::getSignBindingsId, (req, v) -> {
                req.setSignBindingsId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2 = genForlistApiGroupsQuantitiesV2();

    private static HttpRequestDef<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> genForlistApiGroupsQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiGroupsQuantitiesV2Request.class, ListApiGroupsQuantitiesV2Response.class)
                .withName("ListApiGroupsQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiGroupsQuantitiesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> listApiQuantitiesV2 = genForlistApiQuantitiesV2();

    private static HttpRequestDef<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> genForlistApiQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiQuantitiesV2Request.class, ListApiQuantitiesV2Response.class)
                .withName("ListApiQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiQuantitiesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2 = genForlistApisBindedToSignatureKeyV2();

    private static HttpRequestDef<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> genForlistApisBindedToSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisBindedToSignatureKeyV2Request.class, ListApisBindedToSignatureKeyV2Response.class)
                .withName("ListApisBindedToSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2 = genForlistApisNotBoundWithSignatureKeyV2();

    private static HttpRequestDef<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> genForlistApisNotBoundWithSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisNotBoundWithSignatureKeyV2Request.class, ListApisNotBoundWithSignatureKeyV2Response.class)
                .withName("ListApisNotBoundWithSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> listAppQuantitiesV2 = genForlistAppQuantitiesV2();

    private static HttpRequestDef<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> genForlistAppQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppQuantitiesV2Request.class, ListAppQuantitiesV2Response.class)
                .withName("ListAppQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppQuantitiesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2 = genForlistEnvironmentVariablesV2();

    private static HttpRequestDef<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> genForlistEnvironmentVariablesV2() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentVariablesV2Request.class, ListEnvironmentVariablesV2Response.class)
                .withName("ListEnvironmentVariablesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("variable_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getVariableName, (req, v) -> {
                req.setVariableName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2 = genForlistEnvironmentsV2();

    private static HttpRequestDef<ListEnvironmentsV2Request, ListEnvironmentsV2Response> genForlistEnvironmentsV2() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsV2Request, ListEnvironmentsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsV2Request.class, ListEnvironmentsV2Response.class)
                .withName("ListEnvironmentsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEnvironmentsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnvironmentsV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListEnvironmentsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnvironmentsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2 = genForlistRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> genForlistRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestThrottlingPolicyV2Request.class, ListRequestThrottlingPolicyV2Response.class)
                .withName("ListRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2 = genForlistSignatureKeysBindedToApiV2();

    private static HttpRequestDef<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> genForlistSignatureKeysBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSignatureKeysBindedToApiV2Request.class, ListSignatureKeysBindedToApiV2Response.class)
                .withName("ListSignatureKeysBindedToApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/binded-signs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );
        builder.withRequestField("sign_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getSignName, (req, v) -> {
                req.setSignName(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2 = genForlistSignatureKeysV2();

    private static HttpRequestDef<ListSignatureKeysV2Request, ListSignatureKeysV2Response> genForlistSignatureKeysV2() {
        // basic
        HttpRequestDef.Builder<ListSignatureKeysV2Request, ListSignatureKeysV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSignatureKeysV2Request.class, ListSignatureKeysV2Response.class)
                .withName("ListSignatureKeysV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2 = genForlistSpecialThrottlingConfigurationsV2();

    private static HttpRequestDef<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> genForlistSpecialThrottlingConfigurationsV2() {
        // basic
        HttpRequestDef.Builder<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSpecialThrottlingConfigurationsV2Request.class, ListSpecialThrottlingConfigurationsV2Response.class)
                .withName("ListSpecialThrottlingConfigurationsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getObjectType, (req, v) -> {
                req.setObjectType(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2 = genForshowDetailsOfDomainNameCertificateV2();

    private static HttpRequestDef<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> genForshowDetailsOfDomainNameCertificateV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfDomainNameCertificateV2Request.class, ShowDetailsOfDomainNameCertificateV2Response.class)
                .withName("ShowDetailsOfDomainNameCertificateV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2 = genForshowDetailsOfEnvironmentVariableV2();

    private static HttpRequestDef<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> genForshowDetailsOfEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfEnvironmentVariableV2Request.class, ShowDetailsOfEnvironmentVariableV2Response.class)
                .withName("ShowDetailsOfEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfEnvironmentVariableV2Request::getEnvVariableId, (req, v) -> {
                req.setEnvVariableId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2 = genForshowDetailsOfRequestThrottlingPolicyV2();

    private static HttpRequestDef<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> genForshowDetailsOfRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfRequestThrottlingPolicyV2Request.class, ShowDetailsOfRequestThrottlingPolicyV2Response.class)
                .withName("ShowDetailsOfRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2 = genForupdateEnvironmentV2();

    private static HttpRequestDef<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> genForupdateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnvironmentV2Request.class, UpdateEnvironmentV2Response.class)
                .withName("UpdateEnvironmentV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs/{env_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnvReq.class,
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2 = genForupdateRequestThrottlingPolicyV2();

    private static HttpRequestDef<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> genForupdateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRequestThrottlingPolicyV2Request.class, UpdateRequestThrottlingPolicyV2Response.class)
                .withName("UpdateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleReq.class,
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2 = genForupdateSignatureKeyV2();

    private static HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> genForupdateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSignatureKeyV2Request.class, UpdateSignatureKeyV2Response.class)
                .withName("UpdateSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs/{sign_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SignatureReq.class,
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2 = genForupdateSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> genForupdateSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSpecialThrottlingConfigurationV2Request.class, UpdateSpecialThrottlingConfigurationV2Response.class)
                .withName("UpdateSpecialThrottlingConfigurationV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("strategy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getStrategyId, (req, v) -> {
                req.setStrategyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleSpecialUpdateReq.class,
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2 = genForassociateRequestThrottlingPolicyV2();

    private static HttpRequestDef<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> genForassociateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateRequestThrottlingPolicyV2Request.class, AssociateRequestThrottlingPolicyV2Response.class)
                .withName("AssociateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleBindingReq.class,
            f -> f.withMarshaller(AssociateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2 = genForbatchDisassociateThrottlingPolicyV2();

    private static HttpRequestDef<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> genForbatchDisassociateThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchDisassociateThrottlingPolicyV2Request.class, BatchDisassociateThrottlingPolicyV2Response.class)
                .withName("BatchDisassociateThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleBindingBatchDelete.class,
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2 = genForcreateApiGroupV2();

    private static HttpRequestDef<CreateApiGroupV2Request, CreateApiGroupV2Response> genForcreateApiGroupV2() {
        // basic
        HttpRequestDef.Builder<CreateApiGroupV2Request, CreateApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiGroupV2Request.class, CreateApiGroupV2Response.class)
                .withName("CreateApiGroupV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiGroupReq.class,
            f -> f.withMarshaller(CreateApiGroupV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateApiV2Request, CreateApiV2Response> createApiV2 = genForcreateApiV2();

    private static HttpRequestDef<CreateApiV2Request, CreateApiV2Response> genForcreateApiV2() {
        // basic
        HttpRequestDef.Builder<CreateApiV2Request, CreateApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiV2Request.class, CreateApiV2Response.class)
                .withName("CreateApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiCreate.class,
            f -> f.withMarshaller(CreateApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2 = genForcreateOrDeletePublishRecordForApiV2();

    private static HttpRequestDef<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> genForcreateOrDeletePublishRecordForApiV2() {
        // basic
        HttpRequestDef.Builder<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrDeletePublishRecordForApiV2Request.class, CreateOrDeletePublishRecordForApiV2Response.class)
                .withName("CreateOrDeletePublishRecordForApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateOrDeletePublishRecordForApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiPublishReq.class,
            f -> f.withMarshaller(CreateOrDeletePublishRecordForApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2 = genFordeleteApiGroupV2();

    private static HttpRequestDef<DeleteApiGroupV2Request, DeleteApiGroupV2Response> genFordeleteApiGroupV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiGroupV2Request, DeleteApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiGroupV2Request.class, DeleteApiGroupV2Response.class)
                .withName("DeleteApiGroupV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2 = genFordeleteApiV2();

    private static HttpRequestDef<DeleteApiV2Request, DeleteApiV2Response> genFordeleteApiV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiV2Request, DeleteApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiV2Request.class, DeleteApiV2Response.class)
                .withName("DeleteApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2 = genFordisassociateRequestThrottlingPolicyV2();

    private static HttpRequestDef<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> genFordisassociateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateRequestThrottlingPolicyV2Request.class, DisassociateRequestThrottlingPolicyV2Response.class)
                .withName("DisassociateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/{throttle_binding_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_binding_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateRequestThrottlingPolicyV2Request::getThrottleBindingId, (req, v) -> {
                req.setThrottleBindingId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2 = genForlistApiGroupsV2();

    private static HttpRequestDef<ListApiGroupsV2Request, ListApiGroupsV2Response> genForlistApiGroupsV2() {
        // basic
        HttpRequestDef.Builder<ListApiGroupsV2Request, ListApiGroupsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiGroupsV2Request.class, ListApiGroupsV2Response.class)
                .withName("ListApiGroupsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2 = genForlistApisBindedToRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> genForlistApisBindedToRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisBindedToRequestThrottlingPolicyV2Request.class, ListApisBindedToRequestThrottlingPolicyV2Response.class)
                .withName("ListApisBindedToRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2 = genForlistApisUnbindedToRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> genForlistApisUnbindedToRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisUnbindedToRequestThrottlingPolicyV2Request.class, ListApisUnbindedToRequestThrottlingPolicyV2Response.class)
                .withName("ListApisUnbindedToRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApisV2Request, ListApisV2Response> listApisV2 = genForlistApisV2();

    private static HttpRequestDef<ListApisV2Request, ListApisV2Response> genForlistApisV2() {
        // basic
        HttpRequestDef.Builder<ListApisV2Request, ListApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisV2Request.class, ListApisV2Response.class)
                .withName("ListApisV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("req_protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getReqProtocol, (req, v) -> {
                req.setReqProtocol(v);
            })
        );
        builder.withRequestField("req_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getReqMethod, (req, v) -> {
                req.setReqMethod(v);
            })
        );
        builder.withRequestField("req_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getReqUri, (req, v) -> {
                req.setReqUri(v);
            })
        );
        builder.withRequestField("auth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getAuthType, (req, v) -> {
                req.setAuthType(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisV2Request::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2 = genForlistRequestThrottlingPoliciesBindedToApiV2();

    private static HttpRequestDef<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> genForlistRequestThrottlingPoliciesBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestThrottlingPoliciesBindedToApiV2Request.class, ListRequestThrottlingPoliciesBindedToApiV2Response.class)
                .withName("ListRequestThrottlingPoliciesBindedToApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/binded-throttles")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("throttle_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getThrottleName, (req, v) -> {
                req.setThrottleName(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2 = genForshowDetailsOfApiGroupV2();

    private static HttpRequestDef<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> genForshowDetailsOfApiGroupV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfApiGroupV2Request.class, ShowDetailsOfApiGroupV2Response.class)
                .withName("ShowDetailsOfApiGroupV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2 = genForshowDetailsOfApiV2();

    private static HttpRequestDef<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> genForshowDetailsOfApiV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfApiV2Request.class, ShowDetailsOfApiV2Response.class)
                .withName("ShowDetailsOfApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2 = genForupdateApiGroupV2();

    private static HttpRequestDef<UpdateApiGroupV2Request, UpdateApiGroupV2Response> genForupdateApiGroupV2() {
        // basic
        HttpRequestDef.Builder<UpdateApiGroupV2Request, UpdateApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiGroupV2Request.class, UpdateApiGroupV2Response.class)
                .withName("UpdateApiGroupV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiGroupReq.class,
            f -> f.withMarshaller(UpdateApiGroupV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiV2Request, UpdateApiV2Response> updateApiV2 = genForupdateApiV2();

    private static HttpRequestDef<UpdateApiV2Request, UpdateApiV2Response> genForupdateApiV2() {
        // basic
        HttpRequestDef.Builder<UpdateApiV2Request, UpdateApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiV2Request.class, UpdateApiV2Response.class)
                .withName("UpdateApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiCreate.class,
            f -> f.withMarshaller(UpdateApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2 = genForcancelingAuthorizationV2();

    private static HttpRequestDef<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> genForcancelingAuthorizationV2() {
        // basic
        HttpRequestDef.Builder<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelingAuthorizationV2Request.class, CancelingAuthorizationV2Response.class)
                .withName("CancelingAuthorizationV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/{app_auth_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelingAuthorizationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_auth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelingAuthorizationV2Request::getAppAuthId, (req, v) -> {
                req.setAppAuthId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckAppV2Request, CheckAppV2Response> checkAppV2 = genForcheckAppV2();

    private static HttpRequestDef<CheckAppV2Request, CheckAppV2Response> genForcheckAppV2() {
        // basic
        HttpRequestDef.Builder<CheckAppV2Request, CheckAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAppV2Request.class, CheckAppV2Response.class)
                .withName("CheckAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/validation/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAnAppV2Request, CreateAnAppV2Response> createAnAppV2 = genForcreateAnAppV2();

    private static HttpRequestDef<CreateAnAppV2Request, CreateAnAppV2Response> genForcreateAnAppV2() {
        // basic
        HttpRequestDef.Builder<CreateAnAppV2Request, CreateAnAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAnAppV2Request.class, CreateAnAppV2Response.class)
                .withName("CreateAnAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAnAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppReq.class,
            f -> f.withMarshaller(CreateAnAppV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2 = genForcreateAuthorizingAppsV2();

    private static HttpRequestDef<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> genForcreateAuthorizingAppsV2() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuthorizingAppsV2Request.class, CreateAuthorizingAppsV2Response.class)
                .withName("CreateAuthorizingAppsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAuthorizingAppsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppAuthReq.class,
            f -> f.withMarshaller(CreateAuthorizingAppsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppV2Request, DeleteAppV2Response> deleteAppV2 = genFordeleteAppV2();

    private static HttpRequestDef<DeleteAppV2Request, DeleteAppV2Response> genFordeleteAppV2() {
        // basic
        HttpRequestDef.Builder<DeleteAppV2Request, DeleteAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppV2Request.class, DeleteAppV2Response.class)
                .withName("DeleteAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2 = genForlistApisBindedToAppV2();

    private static HttpRequestDef<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> genForlistApisBindedToAppV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisBindedToAppV2Request.class, ListApisBindedToAppV2Response.class)
                .withName("ListApisBindedToAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/binded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2 = genForlistApisUnbindedToAppV2();

    private static HttpRequestDef<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> genForlistApisUnbindedToAppV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisUnbindedToAppV2Request.class, ListApisUnbindedToAppV2Response.class)
                .withName("ListApisUnbindedToAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2 = genForlistAppsBindedToApiV2();

    private static HttpRequestDef<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> genForlistAppsBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsBindedToApiV2Request.class, ListAppsBindedToApiV2Response.class)
                .withName("ListAppsBindedToApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/binded-apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAppsV2Request, ListAppsV2Response> listAppsV2 = genForlistAppsV2();

    private static HttpRequestDef<ListAppsV2Request, ListAppsV2Response> genForlistAppsV2() {
        // basic
        HttpRequestDef.Builder<ListAppsV2Request, ListAppsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsV2Request.class, ListAppsV2Response.class)
                .withName("ListAppsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppsV2Request::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getAppKey, (req, v) -> {
                req.setAppKey(v);
            })
        );
        builder.withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getCreator, (req, v) -> {
                req.setCreator(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResettingAppSecretV2Request, ResettingAppSecretV2Response> resettingAppSecretV2 = genForresettingAppSecretV2();

    private static HttpRequestDef<ResettingAppSecretV2Request, ResettingAppSecretV2Response> genForresettingAppSecretV2() {
        // basic
        HttpRequestDef.Builder<ResettingAppSecretV2Request, ResettingAppSecretV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResettingAppSecretV2Request.class, ResettingAppSecretV2Response.class)
                .withName("ResettingAppSecretV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/secret/{app_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResettingAppSecretV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResettingAppSecretV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppSecretReq.class,
            f -> f.withMarshaller(ResettingAppSecretV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2 = genForshowDetailsOfAppV2();

    private static HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> genForshowDetailsOfAppV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppV2Request.class, ShowDetailsOfAppV2Response.class)
                .withName("ShowDetailsOfAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppV2Request, UpdateAppV2Response> updateAppV2 = genForupdateAppV2();

    private static HttpRequestDef<UpdateAppV2Request, UpdateAppV2Response> genForupdateAppV2() {
        // basic
        HttpRequestDef.Builder<UpdateAppV2Request, UpdateAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppV2Request.class, UpdateAppV2Response.class)
                .withName("UpdateAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppReq.class,
            f -> f.withMarshaller(UpdateAppV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
