package com.huaweicloud.sdk.aad.v1;

import com.huaweicloud.sdk.aad.v1.model.AddBlackWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.AddBlackWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.AlarmBody;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyAndPackageRequest;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyAndPackageResponse;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchIdBody;
import com.huaweicloud.sdk.aad.v1.model.BatchTransferRuleBody;
import com.huaweicloud.sdk.aad.v1.model.BlackWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.BlackWhiteIpRequestBody;
import com.huaweicloud.sdk.aad.v1.model.CadDomainSwitchRequest;
import com.huaweicloud.sdk.aad.v1.model.CertificateBody;
import com.huaweicloud.sdk.aad.v1.model.CreateAadDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.CreateAadDomainResponse;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyRequestBody;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DeleteAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.DeleteAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.DeleteBlackWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.DeleteBlackWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyAndPackageRequest;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyAndPackageResponse;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DomainRealServerInfo;
import com.huaweicloud.sdk.aad.v1.model.ExecuteUnblockIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ExecuteUnblockIpRequestBody;
import com.huaweicloud.sdk.aad.v1.model.ExecuteUnblockIpResponse;
import com.huaweicloud.sdk.aad.v1.model.HostBody;
import com.huaweicloud.sdk.aad.v1.model.IpBindingBody;
import com.huaweicloud.sdk.aad.v1.model.IpBindingV3Body;
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
import com.huaweicloud.sdk.aad.v1.model.ListSourceIpsRequest;
import com.huaweicloud.sdk.aad.v1.model.ListSourceIpsResponse;
import com.huaweicloud.sdk.aad.v1.model.ListUnblockQuotaStatisticsRequest;
import com.huaweicloud.sdk.aad.v1.model.ListUnblockQuotaStatisticsResponse;
import com.huaweicloud.sdk.aad.v1.model.ListUnboundProtectedIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ListUnboundProtectedIpResponse;
import com.huaweicloud.sdk.aad.v1.model.ModifyDomainWebSwitchRequest;
import com.huaweicloud.sdk.aad.v1.model.ModifyDomainWebSwitchResponse;
import com.huaweicloud.sdk.aad.v1.model.SetCertForDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.SetCertForDomainResponse;
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
        genForExecuteUnblockIp();

    private static HttpRequestDef<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse> genForExecuteUnblockIp() {
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
            f -> f.withMarshaller(ExecuteUnblockIpRequest::getDomainId, ExecuteUnblockIpRequest::setDomainId));
        builder.<ExecuteUnblockIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteUnblockIpRequestBody.class),
            f -> f.withMarshaller(ExecuteUnblockIpRequest::getBody, ExecuteUnblockIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockIpsRequest, ListBlockIpsResponse> listBlockIps = genForListBlockIps();

    private static HttpRequestDef<ListBlockIpsRequest, ListBlockIpsResponse> genForListBlockIps() {
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
            f -> f.withMarshaller(ListBlockIpsRequest::getDomainId, ListBlockIpsRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse> listUnblockQuotaStatistics =
        genForListUnblockQuotaStatistics();

    private static HttpRequestDef<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse> genForListUnblockQuotaStatistics() {
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
            f -> f.withMarshaller(ListUnblockQuotaStatisticsRequest::getDomainId,
                ListUnblockQuotaStatisticsRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse> showBlockStatistics =
        genForShowBlockStatistics();

    private static HttpRequestDef<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse> genForShowBlockStatistics() {
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
            f -> f.withMarshaller(ShowBlockStatisticsRequest::getDomainId, ShowBlockStatisticsRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUnblockRecordRequest, ShowUnblockRecordResponse> showUnblockRecord =
        genForShowUnblockRecord();

    private static HttpRequestDef<ShowUnblockRecordRequest, ShowUnblockRecordResponse> genForShowUnblockRecord() {
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
            f -> f.withMarshaller(ShowUnblockRecordRequest::getDomainId, ShowUnblockRecordRequest::setDomainId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowUnblockRecordRequest::getStartTime, ShowUnblockRecordRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowUnblockRecordRequest::getEndTime, ShowUnblockRecordRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddBlackWhiteIpListRequest, AddBlackWhiteIpListResponse> addBlackWhiteIpList =
        genForAddBlackWhiteIpList();

    private static HttpRequestDef<AddBlackWhiteIpListRequest, AddBlackWhiteIpListResponse> genForAddBlackWhiteIpList() {
        // basic
        HttpRequestDef.Builder<AddBlackWhiteIpListRequest, AddBlackWhiteIpListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddBlackWhiteIpListRequest.class, AddBlackWhiteIpListResponse.class)
                .withName("AddBlackWhiteIpList")
                .withUri("/v1/{project_id}/aad/external/bwlist")
                .withContentType("application/json");

        // requests
        builder.<BlackWhiteIpListRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BlackWhiteIpListRequest.class),
            f -> f.withMarshaller(AddBlackWhiteIpListRequest::getBody, AddBlackWhiteIpListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse> addPolicyBlackAndWhiteIpList =
        genForAddPolicyBlackAndWhiteIpList();

    private static HttpRequestDef<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse> genForAddPolicyBlackAndWhiteIpList() {
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
            f -> f.withMarshaller(AddPolicyBlackAndWhiteIpListRequest::getPolicyId,
                AddPolicyBlackAndWhiteIpListRequest::setPolicyId));
        builder.<BlackWhiteIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BlackWhiteIpRequestBody.class),
            f -> f.withMarshaller(AddPolicyBlackAndWhiteIpListRequest::getBody,
                AddPolicyBlackAndWhiteIpListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse> associateIpToPolicy =
        genForAssociateIpToPolicy();

    private static HttpRequestDef<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse> genForAssociateIpToPolicy() {
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
            f -> f.withMarshaller(AssociateIpToPolicyRequest::getPolicyId, AssociateIpToPolicyRequest::setPolicyId));
        builder.<IpBindingBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpBindingBody.class),
            f -> f.withMarshaller(AssociateIpToPolicyRequest::getBody, AssociateIpToPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateIpToPolicyAndPackageRequest, AssociateIpToPolicyAndPackageResponse> associateIpToPolicyAndPackage =
        genForAssociateIpToPolicyAndPackage();

    private static HttpRequestDef<AssociateIpToPolicyAndPackageRequest, AssociateIpToPolicyAndPackageResponse> genForAssociateIpToPolicyAndPackage() {
        // basic
        HttpRequestDef.Builder<AssociateIpToPolicyAndPackageRequest, AssociateIpToPolicyAndPackageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateIpToPolicyAndPackageRequest.class,
                    AssociateIpToPolicyAndPackageResponse.class)
                .withName("AssociateIpToPolicyAndPackage")
                .withUri("/v3/cnad/policies/{policy_id}/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateIpToPolicyAndPackageRequest::getPolicyId,
                AssociateIpToPolicyAndPackageRequest::setPolicyId));
        builder.<IpBindingV3Body>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpBindingV3Body.class),
            f -> f.withMarshaller(AssociateIpToPolicyAndPackageRequest::getBody,
                AssociateIpToPolicyAndPackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse> batchCreateInstanceIpRule =
        genForBatchCreateInstanceIpRule();

    private static HttpRequestDef<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse> genForBatchCreateInstanceIpRule() {
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
            f -> f.withMarshaller(BatchCreateInstanceIpRuleRequest::getInstanceId,
                BatchCreateInstanceIpRuleRequest::setInstanceId));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateInstanceIpRuleRequest::getIp, BatchCreateInstanceIpRuleRequest::setIp));
        builder.<BatchTransferRuleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTransferRuleBody.class),
            f -> f.withMarshaller(BatchCreateInstanceIpRuleRequest::getBody,
                BatchCreateInstanceIpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse> batchDeleteInstanceIpRule =
        genForBatchDeleteInstanceIpRule();

    private static HttpRequestDef<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse> genForBatchDeleteInstanceIpRule() {
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
            f -> f.withMarshaller(BatchDeleteInstanceIpRuleRequest::getInstanceId,
                BatchDeleteInstanceIpRuleRequest::setInstanceId));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteInstanceIpRuleRequest::getIp, BatchDeleteInstanceIpRuleRequest::setIp));
        builder.<BatchIdBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchIdBody.class),
            f -> f.withMarshaller(BatchDeleteInstanceIpRuleRequest::getBody,
                BatchDeleteInstanceIpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAadDomainRequest, CreateAadDomainResponse> createAadDomain =
        genForCreateAadDomain();

    private static HttpRequestDef<CreateAadDomainRequest, CreateAadDomainResponse> genForCreateAadDomain() {
        // basic
        HttpRequestDef.Builder<CreateAadDomainRequest, CreateAadDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAadDomainRequest.class, CreateAadDomainResponse.class)
                .withName("CreateAadDomain")
                .withUri("/v1/{project_id}/aad/external/domains")
                .withContentType("application/json");

        // requests
        builder.<HostBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HostBody.class),
            f -> f.withMarshaller(CreateAadDomainRequest::getBody, CreateAadDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForCreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForCreatePolicy() {
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
            f -> f.withMarshaller(CreatePolicyRequest::getBody, CreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse> deleteAlarmConfig =
        genForDeleteAlarmConfig();

    private static HttpRequestDef<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse> genForDeleteAlarmConfig() {
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

    public static final HttpRequestDef<DeleteBlackWhiteIpListRequest, DeleteBlackWhiteIpListResponse> deleteBlackWhiteIpList =
        genForDeleteBlackWhiteIpList();

    private static HttpRequestDef<DeleteBlackWhiteIpListRequest, DeleteBlackWhiteIpListResponse> genForDeleteBlackWhiteIpList() {
        // basic
        HttpRequestDef.Builder<DeleteBlackWhiteIpListRequest, DeleteBlackWhiteIpListResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBlackWhiteIpListRequest.class, DeleteBlackWhiteIpListResponse.class)
            .withName("DeleteBlackWhiteIpList")
            .withUri("/v1/{project_id}/aad/external/bwlist")
            .withContentType("application/json");

        // requests
        builder.<BlackWhiteIpListRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BlackWhiteIpListRequest.class),
            f -> f.withMarshaller(DeleteBlackWhiteIpListRequest::getBody, DeleteBlackWhiteIpListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
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
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse> deletePolicyBlackAndWhiteIpList =
        genForDeletePolicyBlackAndWhiteIpList();

    private static HttpRequestDef<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse> genForDeletePolicyBlackAndWhiteIpList() {
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
            f -> f.withMarshaller(DeletePolicyBlackAndWhiteIpListRequest::getPolicyId,
                DeletePolicyBlackAndWhiteIpListRequest::setPolicyId));
        builder.<BlackWhiteIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BlackWhiteIpRequestBody.class),
            f -> f.withMarshaller(DeletePolicyBlackAndWhiteIpListRequest::getBody,
                DeletePolicyBlackAndWhiteIpListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse> disassociateIpFromPolicy =
        genForDisassociateIpFromPolicy();

    private static HttpRequestDef<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse> genForDisassociateIpFromPolicy() {
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
            f -> f.withMarshaller(DisassociateIpFromPolicyRequest::getPolicyId,
                DisassociateIpFromPolicyRequest::setPolicyId));
        builder.<IpBindingBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpBindingBody.class),
            f -> f.withMarshaller(DisassociateIpFromPolicyRequest::getBody, DisassociateIpFromPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateIpFromPolicyAndPackageRequest, DisassociateIpFromPolicyAndPackageResponse> disassociateIpFromPolicyAndPackage =
        genForDisassociateIpFromPolicyAndPackage();

    private static HttpRequestDef<DisassociateIpFromPolicyAndPackageRequest, DisassociateIpFromPolicyAndPackageResponse> genForDisassociateIpFromPolicyAndPackage() {
        // basic
        HttpRequestDef.Builder<DisassociateIpFromPolicyAndPackageRequest, DisassociateIpFromPolicyAndPackageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateIpFromPolicyAndPackageRequest.class,
                    DisassociateIpFromPolicyAndPackageResponse.class)
                .withName("DisassociateIpFromPolicyAndPackage")
                .withUri("/v3/cnad/policies/{policy_id}/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateIpFromPolicyAndPackageRequest::getPolicyId,
                DisassociateIpFromPolicyAndPackageRequest::setPolicyId));
        builder.<IpBindingV3Body>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpBindingV3Body.class),
            f -> f.withMarshaller(DisassociateIpFromPolicyAndPackageRequest::getBody,
                DisassociateIpFromPolicyAndPackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainRequest, ListDomainResponse> listDomain = genForListDomain();

    private static HttpRequestDef<ListDomainRequest, ListDomainResponse> genForListDomain() {
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

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForListInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForListInstance() {
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
        genForListInstanceId();

    private static HttpRequestDef<ListInstanceIdRequest, ListInstanceIdResponse> genForListInstanceId() {
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
            f -> f.withMarshaller(ListInstanceIdRequest::getDomainId, ListInstanceIdRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse> listInstanceIpRule =
        genForListInstanceIpRule();

    private static HttpRequestDef<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse> genForListInstanceIpRule() {
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
            f -> f.withMarshaller(ListInstanceIpRuleRequest::getInstanceId, ListInstanceIpRuleRequest::setInstanceId));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceIpRuleRequest::getIp, ListInstanceIpRuleRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPackageRequest, ListPackageResponse> listPackage = genForListPackage();

    private static HttpRequestDef<ListPackageRequest, ListPackageResponse> genForListPackage() {
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

    public static final HttpRequestDef<ListPeakRequest, ListPeakResponse> listPeak = genForListPeak();

    private static HttpRequestDef<ListPeakRequest, ListPeakResponse> genForListPeak() {
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
            f -> f.withMarshaller(ListPeakRequest::getInstanceId, ListPeakRequest::setInstanceId));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeakRequest::getIp, ListPeakRequest::setIp));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeakRequest::getStartTime, ListPeakRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPeakRequest::getEndTime, ListPeakRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForListPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForListPolicy() {
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
            f -> f.withMarshaller(ListPolicyRequest::getOffset, ListPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getLimit, ListPolicyRequest::setLimit));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getPolicyName, ListPolicyRequest::setPolicyName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedIpRequest, ListProtectedIpResponse> listProtectedIp =
        genForListProtectedIp();

    private static HttpRequestDef<ListProtectedIpRequest, ListProtectedIpResponse> genForListProtectedIp() {
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
            f -> f.withMarshaller(ListProtectedIpRequest::getOffset, ListProtectedIpRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getLimit, ListProtectedIpRequest::setLimit));
        builder.<String>withRequestField("package_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getPackageId, ListProtectedIpRequest::setPackageId));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getPolicyId, ListProtectedIpRequest::setPolicyId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getIp, ListProtectedIpRequest::setIp));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedIpRequest::getTag, ListProtectedIpRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSourceIpsRequest, ListSourceIpsResponse> listSourceIps =
        genForListSourceIps();

    private static HttpRequestDef<ListSourceIpsRequest, ListSourceIpsResponse> genForListSourceIps() {
        // basic
        HttpRequestDef.Builder<ListSourceIpsRequest, ListSourceIpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSourceIpsRequest.class, ListSourceIpsResponse.class)
                .withName("ListSourceIps")
                .withUri("/v1/{project_id}/aad/external/source-ip")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse> listUnboundProtectedIp =
        genForListUnboundProtectedIp();

    private static HttpRequestDef<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse> genForListUnboundProtectedIp() {
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
            f -> f.withMarshaller(ListUnboundProtectedIpRequest::getPackageId,
                ListUnboundProtectedIpRequest::setPackageId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnboundProtectedIpRequest::getOffset, ListUnboundProtectedIpRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnboundProtectedIpRequest::getLimit, ListUnboundProtectedIpRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyDomainWebSwitchRequest, ModifyDomainWebSwitchResponse> modifyDomainWebSwitch =
        genForModifyDomainWebSwitch();

    private static HttpRequestDef<ModifyDomainWebSwitchRequest, ModifyDomainWebSwitchResponse> genForModifyDomainWebSwitch() {
        // basic
        HttpRequestDef.Builder<ModifyDomainWebSwitchRequest, ModifyDomainWebSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ModifyDomainWebSwitchRequest.class, ModifyDomainWebSwitchResponse.class)
            .withName("ModifyDomainWebSwitch")
            .withUri("/v1/{project_id}/aad/external/domains/switch")
            .withContentType("application/json");

        // requests
        builder.<CadDomainSwitchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CadDomainSwitchRequest.class),
            f -> f.withMarshaller(ModifyDomainWebSwitchRequest::getBody, ModifyDomainWebSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetCertForDomainRequest, SetCertForDomainResponse> setCertForDomain =
        genForSetCertForDomain();

    private static HttpRequestDef<SetCertForDomainRequest, SetCertForDomainResponse> genForSetCertForDomain() {
        // basic
        HttpRequestDef.Builder<SetCertForDomainRequest, SetCertForDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetCertForDomainRequest.class, SetCertForDomainResponse.class)
                .withName("SetCertForDomain")
                .withUri("/v1/{project_id}/aad/external/domains/certificate")
                .withContentType("application/json");

        // requests
        builder.<CertificateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertificateBody.class),
            f -> f.withMarshaller(SetCertForDomainRequest::getBody, SetCertForDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfig =
        genForShowAlarmConfig();

    private static HttpRequestDef<ShowAlarmConfigRequest, ShowAlarmConfigResponse> genForShowAlarmConfig() {
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

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForShowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForShowPolicy() {
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
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, ShowPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfig =
        genForUpdateAlarmConfig();

    private static HttpRequestDef<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> genForUpdateAlarmConfig() {
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
            f -> f.withMarshaller(UpdateAlarmConfigRequest::getBody, UpdateAlarmConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> updateDomain = genForUpdateDomain();

    private static HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> genForUpdateDomain() {
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
            f -> f.withMarshaller(UpdateDomainRequest::getDomainId, UpdateDomainRequest::setDomainId));
        builder.<DomainRealServerInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainRealServerInfo.class),
            f -> f.withMarshaller(UpdateDomainRequest::getBody, UpdateDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse> updateInstanceIpRule =
        genForUpdateInstanceIpRule();

    private static HttpRequestDef<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse> genForUpdateInstanceIpRule() {
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
            f -> f.withMarshaller(UpdateInstanceIpRuleRequest::getInstanceId,
                UpdateInstanceIpRuleRequest::setInstanceId));
        builder.<String>withRequestField("ip",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceIpRuleRequest::getIp, UpdateInstanceIpRuleRequest::setIp));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceIpRuleRequest::getRuleId, UpdateInstanceIpRuleRequest::setRuleId));
        builder.<TransferRuleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferRuleBody.class),
            f -> f.withMarshaller(UpdateInstanceIpRuleRequest::getBody, UpdateInstanceIpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePackageIpRequest, UpdatePackageIpResponse> updatePackageIp =
        genForUpdatePackageIp();

    private static HttpRequestDef<UpdatePackageIpRequest, UpdatePackageIpResponse> genForUpdatePackageIp() {
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
            f -> f.withMarshaller(UpdatePackageIpRequest::getPackageId, UpdatePackageIpRequest::setPackageId));
        builder.<UpdatePackageIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePackageIpRequestBody.class),
            f -> f.withMarshaller(UpdatePackageIpRequest::getBody, UpdatePackageIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePackageNameRequest, UpdatePackageNameResponse> updatePackageName =
        genForUpdatePackageName();

    private static HttpRequestDef<UpdatePackageNameRequest, UpdatePackageNameResponse> genForUpdatePackageName() {
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
            f -> f.withMarshaller(UpdatePackageNameRequest::getPackageId, UpdatePackageNameRequest::setPackageId));
        builder.<UpdatePackageNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePackageNameRequestBody.class),
            f -> f.withMarshaller(UpdatePackageNameRequest::getBody, UpdatePackageNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForUpdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForUpdatePolicy() {
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
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, UpdatePolicyRequest::setPolicyId));
        builder.<UpdatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, UpdatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse> updateTagForProtectedIp =
        genForUpdateTagForProtectedIp();

    private static HttpRequestDef<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse> genForUpdateTagForProtectedIp() {
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
            f -> f.withMarshaller(UpdateTagForProtectedIpRequest::getBody, UpdateTagForProtectedIpRequest::setBody));

        // response

        return builder.build();
    }

}
