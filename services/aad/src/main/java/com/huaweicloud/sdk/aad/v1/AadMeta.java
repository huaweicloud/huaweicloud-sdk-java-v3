package com.huaweicloud.sdk.aad.v1;

import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.AlarmBody;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchIdBody;
import com.huaweicloud.sdk.aad.v1.model.BatchTransferRuleBody;
import com.huaweicloud.sdk.aad.v1.model.BlackWhiteIpRequestBody;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyRequestBody;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DeleteAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.DeleteAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DomainRealServerInfo;
import com.huaweicloud.sdk.aad.v1.model.ExecuteUnblockIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ExecuteUnblockIpRequestBody;
import com.huaweicloud.sdk.aad.v1.model.ExecuteUnblockIpResponse;
import com.huaweicloud.sdk.aad.v1.model.IpBindingBody;
import com.huaweicloud.sdk.aad.v1.model.ListBlockIpsRequest;
import com.huaweicloud.sdk.aad.v1.model.ListBlockIpsResponse;
import com.huaweicloud.sdk.aad.v1.model.ListDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.ListDomainResponse;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceIdRequest;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceIdResponse;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceRequest;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceResponse;
import com.huaweicloud.sdk.aad.v1.model.ListPackageRequest;
import com.huaweicloud.sdk.aad.v1.model.ListPackageResponse;
import com.huaweicloud.sdk.aad.v1.model.ListPeakRequest;
import com.huaweicloud.sdk.aad.v1.model.ListPeakResponse;
import com.huaweicloud.sdk.aad.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.ListProtectedIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ListProtectedIpResponse;
import com.huaweicloud.sdk.aad.v1.model.ListUnblockQuotaStatisticsRequest;
import com.huaweicloud.sdk.aad.v1.model.ListUnblockQuotaStatisticsResponse;
import com.huaweicloud.sdk.aad.v1.model.ListUnboundProtectedIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ListUnboundProtectedIpResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowBlockStatisticsRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowBlockStatisticsResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowUnblockRecordRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowUnblockRecordResponse;
import com.huaweicloud.sdk.aad.v1.model.TransferRuleBody;
import com.huaweicloud.sdk.aad.v1.model.UpdateAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdateDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateDomainResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdateInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageIpRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageIpRequestBody;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageIpResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageNameRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageNameRequestBody;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageNameResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdatePolicyRequestBody;
import com.huaweicloud.sdk.aad.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdateProtectedIpBody;
import com.huaweicloud.sdk.aad.v1.model.UpdateTagForProtectedIpRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateTagForProtectedIpResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AadMeta {

    public static final HttpRequestDef<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse> executeUnblockIp =
        genForexecuteUnblockIp();

    private static HttpRequestDef<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse> genForexecuteUnblockIp() {
        // basic
        HttpRequestDef.Builder<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteUnblockIpRequest.class, ExecuteUnblockIpResponse.class)
                .withName("ExecuteUnblockIp")
                .withUri("/v1/unblockservice/{domain_id}/unblock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteUnblockIpRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<ExecuteUnblockIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteUnblockIpRequestBody.class),
            f -> f.withMarshaller(ExecuteUnblockIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockIpsRequest, ListBlockIpsResponse> listBlockIps = genForlistBlockIps();

    private static HttpRequestDef<ListBlockIpsRequest, ListBlockIpsResponse> genForlistBlockIps() {
        // basic
        HttpRequestDef.Builder<ListBlockIpsRequest, ListBlockIpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBlockIpsRequest.class, ListBlockIpsResponse.class)
                .withName("ListBlockIps")
                .withUri("/v1/unblockservice/{domain_id}/block-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockIpsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse> listUnblockQuotaStatistics =
        genForlistUnblockQuotaStatistics();

    private static HttpRequestDef<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse> genForlistUnblockQuotaStatistics() {
        // basic
        HttpRequestDef.Builder<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListUnblockQuotaStatisticsRequest.class,
                    ListUnblockQuotaStatisticsResponse.class)
                .withName("ListUnblockQuotaStatistics")
                .withUri("/v1/unblockservice/{domain_id}/unblock-quota-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnblockQuotaStatisticsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse> showBlockStatistics =
        genForshowBlockStatistics();

    private static HttpRequestDef<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse> genForshowBlockStatistics() {
        // basic
        HttpRequestDef.Builder<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBlockStatisticsRequest.class, ShowBlockStatisticsResponse.class)
                .withName("ShowBlockStatistics")
                .withUri("/v1/unblockservice/{domain_id}/block-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBlockStatisticsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUnblockRecordRequest, ShowUnblockRecordResponse> showUnblockRecord =
        genForshowUnblockRecord();

    private static HttpRequestDef<ShowUnblockRecordRequest, ShowUnblockRecordResponse> genForshowUnblockRecord() {
        // basic
        HttpRequestDef.Builder<ShowUnblockRecordRequest, ShowUnblockRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUnblockRecordRequest.class, ShowUnblockRecordResponse.class)
                .withName("ShowUnblockRecord")
                .withUri("/v1/unblockservice/{domain_id}/unblock-record")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUnblockRecordRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowUnblockRecordRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowUnblockRecordRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse> addPolicyBlackAndWhiteIpList =
        genForaddPolicyBlackAndWhiteIpList();

    private static HttpRequestDef<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse> genForaddPolicyBlackAndWhiteIpList() {
        // basic
        HttpRequestDef.Builder<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddPolicyBlackAndWhiteIpListRequest.class,
                    AddPolicyBlackAndWhiteIpListResponse.class)
                .withName("AddPolicyBlackAndWhiteIpList")
                .withUri("/v1/cnad/policies/{policy_id}/ip-list/add")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPolicyBlackAndWhiteIpListRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<BlackWhiteIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BlackWhiteIpRequestBody.class),
            f -> f.withMarshaller(AddPolicyBlackAndWhiteIpListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse> associateIpToPolicy =
        genForassociateIpToPolicy();

    private static HttpRequestDef<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse> genForassociateIpToPolicy() {
        // basic
        HttpRequestDef.Builder<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateIpToPolicyRequest.class, AssociateIpToPolicyResponse.class)
                .withName("AssociateIpToPolicy")
                .withUri("/v1/cnad/policies/{policy_id}/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateIpToPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<IpBindingBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpBindingBody.class),
            f -> f.withMarshaller(AssociateIpToPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse> batchCreateInstanceIpRule =
        genForbatchCreateInstanceIpRule();

    private static HttpRequestDef<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse> genForbatchCreateInstanceIpRule() {
        // basic
        HttpRequestDef.Builder<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateInstanceIpRuleRequest.class,
                    BatchCreateInstanceIpRuleResponse.class)
                .withName("BatchCreateInstanceIpRule")
                .withUri("/v1/aad/instances/{instance_id}/{ip}/rules/batch-create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateInstanceIpRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateInstanceIpRuleRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<BatchTransferRuleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTransferRuleBody.class),
            f -> f.withMarshaller(BatchCreateInstanceIpRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse> batchDeleteInstanceIpRule =
        genForbatchDeleteInstanceIpRule();

    private static HttpRequestDef<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse> genForbatchDeleteInstanceIpRule() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteInstanceIpRuleRequest.class,
                    BatchDeleteInstanceIpRuleResponse.class)
                .withName("BatchDeleteInstanceIpRule")
                .withUri("/v1/aad/instances/{instance_id}/{ip}/rules/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteInstanceIpRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteInstanceIpRuleRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<BatchIdBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchIdBody.class),
            f -> f.withMarshaller(BatchDeleteInstanceIpRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForcreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForcreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/cnad/policies")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyRequestBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse> deleteAlarmConfig =
        genFordeleteAlarmConfig();

    private static HttpRequestDef<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse> genFordeleteAlarmConfig() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmConfigRequest.class, DeleteAlarmConfigResponse.class)
                .withName("DeleteAlarmConfig")
                .withUri("/v1/cnad/alarm-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genFordeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genFordeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/cnad/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse> deletePolicyBlackAndWhiteIpList =
        genFordeletePolicyBlackAndWhiteIpList();

    private static HttpRequestDef<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse> genFordeletePolicyBlackAndWhiteIpList() {
        // basic
        HttpRequestDef.Builder<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeletePolicyBlackAndWhiteIpListRequest.class,
                    DeletePolicyBlackAndWhiteIpListResponse.class)
                .withName("DeletePolicyBlackAndWhiteIpList")
                .withUri("/v1/cnad/policies/{policy_id}/ip-list/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyBlackAndWhiteIpListRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<BlackWhiteIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BlackWhiteIpRequestBody.class),
            f -> f.withMarshaller(DeletePolicyBlackAndWhiteIpListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse> disassociateIpFromPolicy =
        genFordisassociateIpFromPolicy();

    private static HttpRequestDef<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse> genFordisassociateIpFromPolicy() {
        // basic
        HttpRequestDef.Builder<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, DisassociateIpFromPolicyRequest.class, DisassociateIpFromPolicyResponse.class)
                .withName("DisassociateIpFromPolicy")
                .withUri("/v1/cnad/policies/{policy_id}/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateIpFromPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<IpBindingBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpBindingBody.class),
            f -> f.withMarshaller(DisassociateIpFromPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainRequest, ListDomainResponse> listDomain = genForlistDomain();

    private static HttpRequestDef<ListDomainRequest, ListDomainResponse> genForlistDomain() {
        // basic
        HttpRequestDef.Builder<ListDomainRequest, ListDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainRequest.class, ListDomainResponse.class)
                .withName("ListDomain")
                .withUri("/v1/aad/protected-domains")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForlistInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForlistInstance() {
        // basic
        HttpRequestDef.Builder<ListInstanceRequest, ListInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceRequest.class, ListInstanceResponse.class)
                .withName("ListInstance")
                .withUri("/v1/aad/instances")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceIdRequest, ListInstanceIdResponse> listInstanceId =
        genForlistInstanceId();

    private static HttpRequestDef<ListInstanceIdRequest, ListInstanceIdResponse> genForlistInstanceId() {
        // basic
        HttpRequestDef.Builder<ListInstanceIdRequest, ListInstanceIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceIdRequest.class, ListInstanceIdResponse.class)
                .withName("ListInstanceId")
                .withUri("/v1/aad/protected-domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceIdRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse> listInstanceIpRule =
        genForlistInstanceIpRule();

    private static HttpRequestDef<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse> genForlistInstanceIpRule() {
        // basic
        HttpRequestDef.Builder<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceIpRuleRequest.class, ListInstanceIpRuleResponse.class)
                .withName("ListInstanceIpRule")
                .withUri("/v1/aad/instances/{instance_id}/{ip}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceIpRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceIpRuleRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPackageRequest, ListPackageResponse> listPackage = genForlistPackage();

    private static HttpRequestDef<ListPackageRequest, ListPackageResponse> genForlistPackage() {
        // basic
        HttpRequestDef.Builder<ListPackageRequest, ListPackageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPackageRequest.class, ListPackageResponse.class)
                .withName("ListPackage")
                .withUri("/v1/cnad/packages")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPeakRequest, ListPeakResponse> listPeak = genForlistPeak();

    private static HttpRequestDef<ListPeakRequest, ListPeakResponse> genForlistPeak() {
        // basic
        HttpRequestDef.Builder<ListPeakRequest, ListPeakResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPeakRequest.class, ListPeakResponse.class)
                .withName("ListPeak")
                .withUri("/v1/aad/instances/{instance_id}/{ip}/ddos-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeakRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeakRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeakRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeakRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForlistPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForlistPolicy() {
        // basic
        HttpRequestDef.Builder<ListPolicyRequest, ListPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyRequest.class, ListPolicyResponse.class)
                .withName("ListPolicy")
                .withUri("/v1/cnad/policies")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getPolicyName, (req, v) -> {
                req.setPolicyName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedIpRequest, ListProtectedIpResponse> listProtectedIp =
        genForlistProtectedIp();

    private static HttpRequestDef<ListProtectedIpRequest, ListProtectedIpResponse> genForlistProtectedIp() {
        // basic
        HttpRequestDef.Builder<ListProtectedIpRequest, ListProtectedIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProtectedIpRequest.class, ListProtectedIpResponse.class)
                .withName("ListProtectedIp")
                .withUri("/v1/cnad/protected-ips")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("package_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getPackageId, (req, v) -> {
                req.setPackageId(v);
            }));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse> listUnboundProtectedIp =
        genForlistUnboundProtectedIp();

    private static HttpRequestDef<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse> genForlistUnboundProtectedIp() {
        // basic
        HttpRequestDef.Builder<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUnboundProtectedIpRequest.class, ListUnboundProtectedIpResponse.class)
            .withName("ListUnboundProtectedIp")
            .withUri("/v1/cnad/packages/{package_id}/unbound-protected-ips")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnboundProtectedIpRequest::getPackageId, (req, v) -> {
                req.setPackageId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnboundProtectedIpRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnboundProtectedIpRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfig =
        genForshowAlarmConfig();

    private static HttpRequestDef<ShowAlarmConfigRequest, ShowAlarmConfigResponse> genForshowAlarmConfig() {
        // basic
        HttpRequestDef.Builder<ShowAlarmConfigRequest, ShowAlarmConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmConfigRequest.class, ShowAlarmConfigResponse.class)
                .withName("ShowAlarmConfig")
                .withUri("/v1/cnad/alarm-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForshowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForshowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/cnad/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfig =
        genForupdateAlarmConfig();

    private static HttpRequestDef<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> genForupdateAlarmConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAlarmConfigRequest.class, UpdateAlarmConfigResponse.class)
                .withName("UpdateAlarmConfig")
                .withUri("/v1/cnad/alarm-config")
                .withContentType("application/json");

        // requests
        builder.<AlarmBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmBody.class),
            f -> f.withMarshaller(UpdateAlarmConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> updateDomain = genForupdateDomain();

    private static HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> genForupdateDomain() {
        // basic
        HttpRequestDef.Builder<UpdateDomainRequest, UpdateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainRequest.class, UpdateDomainResponse.class)
                .withName("UpdateDomain")
                .withUri("/v1/aad/protected-domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<DomainRealServerInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainRealServerInfo.class),
            f -> f.withMarshaller(UpdateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse> updateInstanceIpRule =
        genForupdateInstanceIpRule();

    private static HttpRequestDef<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse> genForupdateInstanceIpRule() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceIpRuleRequest.class, UpdateInstanceIpRuleResponse.class)
            .withName("UpdateInstanceIpRule")
            .withUri("/v1/aad/instances/{instance_id}/{ip}/rules/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceIpRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceIpRuleRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceIpRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<TransferRuleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferRuleBody.class),
            f -> f.withMarshaller(UpdateInstanceIpRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePackageIpRequest, UpdatePackageIpResponse> updatePackageIp =
        genForupdatePackageIp();

    private static HttpRequestDef<UpdatePackageIpRequest, UpdatePackageIpResponse> genForupdatePackageIp() {
        // basic
        HttpRequestDef.Builder<UpdatePackageIpRequest, UpdatePackageIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdatePackageIpRequest.class, UpdatePackageIpResponse.class)
                .withName("UpdatePackageIp")
                .withUri("/v1/cnad/packages/{package_id}/protected-ips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePackageIpRequest::getPackageId, (req, v) -> {
                req.setPackageId(v);
            }));
        builder.<UpdatePackageIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePackageIpRequestBody.class),
            f -> f.withMarshaller(UpdatePackageIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePackageNameRequest, UpdatePackageNameResponse> updatePackageName =
        genForupdatePackageName();

    private static HttpRequestDef<UpdatePackageNameRequest, UpdatePackageNameResponse> genForupdatePackageName() {
        // basic
        HttpRequestDef.Builder<UpdatePackageNameRequest, UpdatePackageNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePackageNameRequest.class, UpdatePackageNameResponse.class)
                .withName("UpdatePackageName")
                .withUri("/v1/cnad/packages/{package_id}/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePackageNameRequest::getPackageId, (req, v) -> {
                req.setPackageId(v);
            }));
        builder.<UpdatePackageNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePackageNameRequestBody.class),
            f -> f.withMarshaller(UpdatePackageNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForupdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForupdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/cnad/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<UpdatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse> updateTagForProtectedIp =
        genForupdateTagForProtectedIp();

    private static HttpRequestDef<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse> genForupdateTagForProtectedIp() {
        // basic
        HttpRequestDef.Builder<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTagForProtectedIpRequest.class, UpdateTagForProtectedIpResponse.class)
            .withName("UpdateTagForProtectedIp")
            .withUri("/v1/cnad/protected-ips/tags")
            .withContentType("application/json");

        // requests
        builder.<UpdateProtectedIpBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProtectedIpBody.class),
            f -> f.withMarshaller(UpdateTagForProtectedIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
