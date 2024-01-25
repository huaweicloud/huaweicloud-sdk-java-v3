package com.huaweicloud.sdk.iec.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iec.v1.model.AddNicsRequest;
import com.huaweicloud.sdk.iec.v1.model.AddNicsRequestBody;
import com.huaweicloud.sdk.iec.v1.model.AddNicsResponse;
import com.huaweicloud.sdk.iec.v1.model.AssociateSubnetRequest;
import com.huaweicloud.sdk.iec.v1.model.AssociateSubnetRequestBody;
import com.huaweicloud.sdk.iec.v1.model.AssociateSubnetResponse;
import com.huaweicloud.sdk.iec.v1.model.AttachVipBandwidthRequest;
import com.huaweicloud.sdk.iec.v1.model.AttachVipBandwidthRequestBody;
import com.huaweicloud.sdk.iec.v1.model.AttachVipBandwidthResponse;
import com.huaweicloud.sdk.iec.v1.model.BatchRebootInstanceRequest;
import com.huaweicloud.sdk.iec.v1.model.BatchRebootInstanceRequestBody;
import com.huaweicloud.sdk.iec.v1.model.BatchRebootInstanceResponse;
import com.huaweicloud.sdk.iec.v1.model.BatchStartInstanceRequest;
import com.huaweicloud.sdk.iec.v1.model.BatchStartInstanceRequestBody;
import com.huaweicloud.sdk.iec.v1.model.BatchStartInstanceResponse;
import com.huaweicloud.sdk.iec.v1.model.BatchStopInstanceRequest;
import com.huaweicloud.sdk.iec.v1.model.BatchStopInstanceRequestBody;
import com.huaweicloud.sdk.iec.v1.model.BatchStopInstanceResponse;
import com.huaweicloud.sdk.iec.v1.model.ChangeOsOption;
import com.huaweicloud.sdk.iec.v1.model.ChangeOsRequest;
import com.huaweicloud.sdk.iec.v1.model.ChangeOsResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateDeploymentRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateDeploymentRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateDeploymentResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateFirewallRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateFirewallRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateFirewallResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateImageRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateImageRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateImageResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateInstanceRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateKeypairRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateKeypairRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateKeypairResponse;
import com.huaweicloud.sdk.iec.v1.model.CreatePortRequest;
import com.huaweicloud.sdk.iec.v1.model.CreatePortRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreatePortResponse;
import com.huaweicloud.sdk.iec.v1.model.CreatePublicIpRequest;
import com.huaweicloud.sdk.iec.v1.model.CreatePublicIpRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreatePublicIpResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateRoutesRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateRoutesRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateRoutesResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateRoutetableRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateRoutetableRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateRoutetableResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateSecurityGroupRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateSecurityGroupRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateSecurityGroupResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateSecurityGroupRuleRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateSubnetRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateSubnetRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateSubnetResponse;
import com.huaweicloud.sdk.iec.v1.model.CreateVpcRequest;
import com.huaweicloud.sdk.iec.v1.model.CreateVpcRequestBody;
import com.huaweicloud.sdk.iec.v1.model.CreateVpcResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteBandwidthRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteBandwidthResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteDeploymentRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteDeploymentResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteEdgeCloudRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteEdgeCloudResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteFirewallRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteFirewallResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteImageRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteImageResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteInstancesRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteInstancesRequestBody;
import com.huaweicloud.sdk.iec.v1.model.DeleteInstancesResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteKeypairRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteKeypairResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteNicsRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteNicsRequestBody;
import com.huaweicloud.sdk.iec.v1.model.DeleteNicsResponse;
import com.huaweicloud.sdk.iec.v1.model.DeletePortRequest;
import com.huaweicloud.sdk.iec.v1.model.DeletePortResponse;
import com.huaweicloud.sdk.iec.v1.model.DeletePublicIpRequest;
import com.huaweicloud.sdk.iec.v1.model.DeletePublicIpResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteRoutesRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteRoutesRequestBody;
import com.huaweicloud.sdk.iec.v1.model.DeleteRoutesResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteRoutetableRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteRoutetableResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteSecurityGroupRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteSecurityGroupResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteSecurityGroupRuleRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteSecurityGroupRuleResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteSubnetRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteSubnetResponse;
import com.huaweicloud.sdk.iec.v1.model.DeleteVpcRequest;
import com.huaweicloud.sdk.iec.v1.model.DeleteVpcResponse;
import com.huaweicloud.sdk.iec.v1.model.DetachVipBandwidthRequest;
import com.huaweicloud.sdk.iec.v1.model.DetachVipBandwidthResponse;
import com.huaweicloud.sdk.iec.v1.model.DisassociateSubnetRequest;
import com.huaweicloud.sdk.iec.v1.model.DisassociateSubnetRequestBody;
import com.huaweicloud.sdk.iec.v1.model.DisassociateSubnetResponse;
import com.huaweicloud.sdk.iec.v1.model.ExecuteDeploymentRequest;
import com.huaweicloud.sdk.iec.v1.model.ExecuteDeploymentResponse;
import com.huaweicloud.sdk.iec.v1.model.ExpandEdgecloudRequest;
import com.huaweicloud.sdk.iec.v1.model.ExpandEdgecloudResponse;
import com.huaweicloud.sdk.iec.v1.model.ListBandwidthTypesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListBandwidthTypesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListBandwidthsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListBandwidthsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListCloudImagesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListCloudImagesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListDeploymentsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListDeploymentsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListEdgeCloudRequest;
import com.huaweicloud.sdk.iec.v1.model.ListEdgeCloudResponse;
import com.huaweicloud.sdk.iec.v1.model.ListFirewallsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListFirewallsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListImagesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListImagesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListKeypairsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListKeypairsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListPortsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListPortsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListPublicIpsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListPublicIpsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListQuotaRequest;
import com.huaweicloud.sdk.iec.v1.model.ListQuotaResponse;
import com.huaweicloud.sdk.iec.v1.model.ListRelatedRoutetablesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListRelatedRoutetablesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListRoutesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListRoutesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListRoutetablesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListRoutetablesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListSecurityGroupRulesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListSecurityGroupRulesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListSitesRequest;
import com.huaweicloud.sdk.iec.v1.model.ListSitesResponse;
import com.huaweicloud.sdk.iec.v1.model.ListSubnetsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListSubnetsResponse;
import com.huaweicloud.sdk.iec.v1.model.ListVolumeRequest;
import com.huaweicloud.sdk.iec.v1.model.ListVolumeResponse;
import com.huaweicloud.sdk.iec.v1.model.ListVpcsRequest;
import com.huaweicloud.sdk.iec.v1.model.ListVpcsResponse;
import com.huaweicloud.sdk.iec.v1.model.RebuildImageRequest;
import com.huaweicloud.sdk.iec.v1.model.RebuildImageRequestBody;
import com.huaweicloud.sdk.iec.v1.model.RebuildImageResponse;
import com.huaweicloud.sdk.iec.v1.model.RegisterImageRequest;
import com.huaweicloud.sdk.iec.v1.model.RegisterImageRequestBody;
import com.huaweicloud.sdk.iec.v1.model.RegisterImageResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowBandwidthRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowBandwidthResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowEdgeCloudRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowEdgeCloudResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowFirewallRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowFirewallResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowImageRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowImageResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowKeypairRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowKeypairResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowPortRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowPortResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowPublicIpRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowPublicIpResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowRoutetableRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowRoutetableResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowSecurityGroupRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowSecurityGroupResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowSecurityGroupRuleRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowSecurityGroupRuleResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowSubnetRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowSubnetResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowVolumeRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowVolumeResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowVolumeTypesRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowVolumeTypesResponse;
import com.huaweicloud.sdk.iec.v1.model.ShowVpcRequest;
import com.huaweicloud.sdk.iec.v1.model.ShowVpcResponse;
import com.huaweicloud.sdk.iec.v1.model.SimpleKeypair;
import com.huaweicloud.sdk.iec.v1.model.UpdateBandwidthRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdateBandwidthRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdateBandwidthResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdateFirewallRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdateFirewallRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdateFirewallResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdateFirewallRuleRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdateFirewallRuleRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdateFirewallRuleResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdateInstanceRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdatePortRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdatePortRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdatePortResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdatePublicIpRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdatePublicIpRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdatePublicIpResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdateRoutesRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdateRoutesRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdateRoutesResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdateRoutetableRequesBody;
import com.huaweicloud.sdk.iec.v1.model.UpdateRoutetableRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdateRoutetableResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdateSubnetRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdateSubnetRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdateSubnetResponse;
import com.huaweicloud.sdk.iec.v1.model.UpdateVpcRequest;
import com.huaweicloud.sdk.iec.v1.model.UpdateVpcRequestBody;
import com.huaweicloud.sdk.iec.v1.model.UpdateVpcResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class IecMeta {

    public static final HttpRequestDef<AddNicsRequest, AddNicsResponse> addNics = genForAddNics();

    private static HttpRequestDef<AddNicsRequest, AddNicsResponse> genForAddNics() {
        // basic
        HttpRequestDef.Builder<AddNicsRequest, AddNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddNicsRequest.class, AddNicsResponse.class)
                .withName("AddNics")
                .withUri("/v1/cloudservers/{instance_id}/nics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddNicsRequest::getInstanceId, AddNicsRequest::setInstanceId));
        builder.<AddNicsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddNicsRequestBody.class),
            f -> f.withMarshaller(AddNicsRequest::getBody, AddNicsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSubnetRequest, AssociateSubnetResponse> associateSubnet =
        genForAssociateSubnet();

    private static HttpRequestDef<AssociateSubnetRequest, AssociateSubnetResponse> genForAssociateSubnet() {
        // basic
        HttpRequestDef.Builder<AssociateSubnetRequest, AssociateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateSubnetRequest.class, AssociateSubnetResponse.class)
                .withName("AssociateSubnet")
                .withUri("/v1/routetables/{routetable_id}/associate-subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSubnetRequest::getRoutetableId, AssociateSubnetRequest::setRoutetableId));
        builder.<AssociateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateSubnetRequestBody.class),
            f -> f.withMarshaller(AssociateSubnetRequest::getBody, AssociateSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootInstanceRequest, BatchRebootInstanceResponse> batchRebootInstance =
        genForBatchRebootInstance();

    private static HttpRequestDef<BatchRebootInstanceRequest, BatchRebootInstanceResponse> genForBatchRebootInstance() {
        // basic
        HttpRequestDef.Builder<BatchRebootInstanceRequest, BatchRebootInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRebootInstanceRequest.class, BatchRebootInstanceResponse.class)
                .withName("BatchRebootInstance")
                .withUri("/v1/cloudservers/action")
                .withContentType("application/json");

        // requests
        builder.<BatchRebootInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRebootInstanceRequestBody.class),
            f -> f.withMarshaller(BatchRebootInstanceRequest::getBody, BatchRebootInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartInstanceRequest, BatchStartInstanceResponse> batchStartInstance =
        genForBatchStartInstance();

    private static HttpRequestDef<BatchStartInstanceRequest, BatchStartInstanceResponse> genForBatchStartInstance() {
        // basic
        HttpRequestDef.Builder<BatchStartInstanceRequest, BatchStartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStartInstanceRequest.class, BatchStartInstanceResponse.class)
                .withName("BatchStartInstance")
                .withUri("/v1/cloudservers/action")
                .withContentType("application/json");

        // requests
        builder.<BatchStartInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartInstanceRequestBody.class),
            f -> f.withMarshaller(BatchStartInstanceRequest::getBody, BatchStartInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopInstanceRequest, BatchStopInstanceResponse> batchStopInstance =
        genForBatchStopInstance();

    private static HttpRequestDef<BatchStopInstanceRequest, BatchStopInstanceResponse> genForBatchStopInstance() {
        // basic
        HttpRequestDef.Builder<BatchStopInstanceRequest, BatchStopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopInstanceRequest.class, BatchStopInstanceResponse.class)
                .withName("BatchStopInstance")
                .withUri("/v1/cloudservers/action")
                .withContentType("application/json");

        // requests
        builder.<BatchStopInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopInstanceRequestBody.class),
            f -> f.withMarshaller(BatchStopInstanceRequest::getBody, BatchStopInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeOsRequest, ChangeOsResponse> changeOs = genForChangeOs();

    private static HttpRequestDef<ChangeOsRequest, ChangeOsResponse> genForChangeOs() {
        // basic
        HttpRequestDef.Builder<ChangeOsRequest, ChangeOsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeOsRequest.class, ChangeOsResponse.class)
                .withName("ChangeOs")
                .withUri("/v1/cloudservers/{instance_id}/change-os")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeOsRequest::getInstanceId, ChangeOsRequest::setInstanceId));
        builder.<ChangeOsOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeOsOption.class),
            f -> f.withMarshaller(ChangeOsRequest::getBody, ChangeOsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentRequest, CreateDeploymentResponse> createDeployment =
        genForCreateDeployment();

    private static HttpRequestDef<CreateDeploymentRequest, CreateDeploymentResponse> genForCreateDeployment() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentRequest, CreateDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeploymentRequest.class, CreateDeploymentResponse.class)
                .withName("CreateDeployment")
                .withUri("/v1/deployments")
                .withContentType("application/json");

        // requests
        builder.<CreateDeploymentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeploymentRequestBody.class),
            f -> f.withMarshaller(CreateDeploymentRequest::getBody, CreateDeploymentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageRequest, CreateImageResponse> createImage = genForCreateImage();

    private static HttpRequestDef<CreateImageRequest, CreateImageResponse> genForCreateImage() {
        // basic
        HttpRequestDef.Builder<CreateImageRequest, CreateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageRequest.class, CreateImageResponse.class)
                .withName("CreateImage")
                .withUri("/v1/images/create")
                .withContentType("application/json");

        // requests
        builder.<CreateImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageRequestBody.class),
            f -> f.withMarshaller(CreateImageRequest::getBody, CreateImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/cloudservers")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> createKeypair =
        genForCreateKeypair();

    private static HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> genForCreateKeypair() {
        // basic
        HttpRequestDef.Builder<CreateKeypairRequest, CreateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKeypairRequest.class, CreateKeypairResponse.class)
                .withName("CreateKeypair")
                .withUri("/v1/os-keypairs")
                .withContentType("application/json");

        // requests
        builder.<CreateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeypairRequestBody.class),
            f -> f.withMarshaller(CreateKeypairRequest::getBody, CreateKeypairRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePortRequest, CreatePortResponse> createPort = genForCreatePort();

    private static HttpRequestDef<CreatePortRequest, CreatePortResponse> genForCreatePort() {
        // basic
        HttpRequestDef.Builder<CreatePortRequest, CreatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePortRequest.class, CreatePortResponse.class)
                .withName("CreatePort")
                .withUri("/v1/ports")
                .withContentType("application/json");

        // requests
        builder.<CreatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePortRequestBody.class),
            f -> f.withMarshaller(CreatePortRequest::getBody, CreatePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutesRequest, CreateRoutesResponse> createRoutes = genForCreateRoutes();

    private static HttpRequestDef<CreateRoutesRequest, CreateRoutesResponse> genForCreateRoutes() {
        // basic
        HttpRequestDef.Builder<CreateRoutesRequest, CreateRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoutesRequest.class, CreateRoutesResponse.class)
                .withName("CreateRoutes")
                .withUri("/v1/routetables/{routetable_id}/add-routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRoutesRequest::getRoutetableId, CreateRoutesRequest::setRoutetableId));
        builder.<CreateRoutesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRoutesRequestBody.class),
            f -> f.withMarshaller(CreateRoutesRequest::getBody, CreateRoutesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutetableRequest, CreateRoutetableResponse> createRoutetable =
        genForCreateRoutetable();

    private static HttpRequestDef<CreateRoutetableRequest, CreateRoutetableResponse> genForCreateRoutetable() {
        // basic
        HttpRequestDef.Builder<CreateRoutetableRequest, CreateRoutetableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoutetableRequest.class, CreateRoutetableResponse.class)
                .withName("CreateRoutetable")
                .withUri("/v1/routetables")
                .withContentType("application/json");

        // requests
        builder.<CreateRoutetableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRoutetableRequestBody.class),
            f -> f.withMarshaller(CreateRoutetableRequest::getBody, CreateRoutetableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroup =
        genForCreateSecurityGroup();

    private static HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> genForCreateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupRequest, CreateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecurityGroupRequest.class, CreateSecurityGroupResponse.class)
                .withName("CreateSecurityGroup")
                .withUri("/v1/security-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupRequest::getBody, CreateSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRule =
        genForCreateSecurityGroupRule();

    private static HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> genForCreateSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSecurityGroupRuleRequest.class, CreateSecurityGroupRuleResponse.class)
            .withName("CreateSecurityGroupRule")
            .withUri("/v1/security-group-rules")
            .withContentType("application/json");

        // requests
        builder.<CreateSecurityGroupRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupRuleRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupRuleRequest::getBody, CreateSecurityGroupRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRequest, CreateVpcResponse> createVpc = genForCreateVpc();

    private static HttpRequestDef<CreateVpcRequest, CreateVpcResponse> genForCreateVpc() {
        // basic
        HttpRequestDef.Builder<CreateVpcRequest, CreateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcRequest.class, CreateVpcResponse.class)
                .withName("CreateVpc")
                .withUri("/v1/vpcs")
                .withContentType("application/json");

        // requests
        builder.<CreateVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcRequestBody.class),
            f -> f.withMarshaller(CreateVpcRequest::getBody, CreateVpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBandwidthRequest, DeleteBandwidthResponse> deleteBandwidth =
        genForDeleteBandwidth();

    private static HttpRequestDef<DeleteBandwidthRequest, DeleteBandwidthResponse> genForDeleteBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteBandwidthRequest, DeleteBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBandwidthRequest.class, DeleteBandwidthResponse.class)
                .withName("DeleteBandwidth")
                .withUri("/v1/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBandwidthRequest::getBandwidthId, DeleteBandwidthRequest::setBandwidthId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeployment =
        genForDeleteDeployment();

    private static HttpRequestDef<DeleteDeploymentRequest, DeleteDeploymentResponse> genForDeleteDeployment() {
        // basic
        HttpRequestDef.Builder<DeleteDeploymentRequest, DeleteDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeploymentRequest.class, DeleteDeploymentResponse.class)
                .withName("DeleteDeployment")
                .withUri("/v1/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getDeploymentId, DeleteDeploymentRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> deleteEdgeCloud =
        genForDeleteEdgeCloud();

    private static HttpRequestDef<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> genForDeleteEdgeCloud() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgeCloudRequest.class, DeleteEdgeCloudResponse.class)
                .withName("DeleteEdgeCloud")
                .withUri("/v1/edgeclouds/{edgecloud_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edgecloud_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeCloudRequest::getEdgecloudId, DeleteEdgeCloudRequest::setEdgecloudId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageRequest, DeleteImageResponse> deleteImage = genForDeleteImage();

    private static HttpRequestDef<DeleteImageRequest, DeleteImageResponse> genForDeleteImage() {
        // basic
        HttpRequestDef.Builder<DeleteImageRequest, DeleteImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageRequest.class, DeleteImageResponse.class)
                .withName("DeleteImage")
                .withUri("/v1/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getImageId, DeleteImageRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstances =
        genForDeleteInstances();

    private static HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> genForDeleteInstances() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesRequest, DeleteInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteInstancesRequest.class, DeleteInstancesResponse.class)
                .withName("DeleteInstances")
                .withUri("/v1/cloudservers/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstancesRequestBody.class),
            f -> f.withMarshaller(DeleteInstancesRequest::getBody, DeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypair =
        genForDeleteKeypair();

    private static HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> genForDeleteKeypair() {
        // basic
        HttpRequestDef.Builder<DeleteKeypairRequest, DeleteKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteKeypairRequest.class, DeleteKeypairResponse.class)
                .withName("DeleteKeypair")
                .withUri("/v1/os-keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeypairRequest::getKeypairName, DeleteKeypairRequest::setKeypairName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNicsRequest, DeleteNicsResponse> deleteNics = genForDeleteNics();

    private static HttpRequestDef<DeleteNicsRequest, DeleteNicsResponse> genForDeleteNics() {
        // basic
        HttpRequestDef.Builder<DeleteNicsRequest, DeleteNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteNicsRequest.class, DeleteNicsResponse.class)
                .withName("DeleteNics")
                .withUri("/v1/cloudservers/{instance_id}/nics/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNicsRequest::getInstanceId, DeleteNicsRequest::setInstanceId));
        builder.<DeleteNicsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteNicsRequestBody.class),
            f -> f.withMarshaller(DeleteNicsRequest::getBody, DeleteNicsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortRequest, DeletePortResponse> deletePort = genForDeletePort();

    private static HttpRequestDef<DeletePortRequest, DeletePortResponse> genForDeletePort() {
        // basic
        HttpRequestDef.Builder<DeletePortRequest, DeletePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePortRequest.class, DeletePortResponse.class)
                .withName("DeletePort")
                .withUri("/v1/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePortRequest::getPortId, DeletePortRequest::setPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutesRequest, DeleteRoutesResponse> deleteRoutes = genForDeleteRoutes();

    private static HttpRequestDef<DeleteRoutesRequest, DeleteRoutesResponse> genForDeleteRoutes() {
        // basic
        HttpRequestDef.Builder<DeleteRoutesRequest, DeleteRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteRoutesRequest.class, DeleteRoutesResponse.class)
                .withName("DeleteRoutes")
                .withUri("/v1/routetables/{routetable_id}/delete-routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutesRequest::getRoutetableId, DeleteRoutesRequest::setRoutetableId));
        builder.<DeleteRoutesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteRoutesRequestBody.class),
            f -> f.withMarshaller(DeleteRoutesRequest::getBody, DeleteRoutesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutetableRequest, DeleteRoutetableResponse> deleteRoutetable =
        genForDeleteRoutetable();

    private static HttpRequestDef<DeleteRoutetableRequest, DeleteRoutetableResponse> genForDeleteRoutetable() {
        // basic
        HttpRequestDef.Builder<DeleteRoutetableRequest, DeleteRoutetableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRoutetableRequest.class, DeleteRoutetableResponse.class)
                .withName("DeleteRoutetable")
                .withUri("/v1/routetables/{routetable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutetableRequest::getRoutetableId, DeleteRoutetableRequest::setRoutetableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroup =
        genForDeleteSecurityGroup();

    private static HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> genForDeleteSecurityGroup() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSecurityGroupRequest.class, DeleteSecurityGroupResponse.class)
            .withName("DeleteSecurityGroup")
            .withUri("/v1/security-groups/{security_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupRequest::getSecurityGroupId,
                DeleteSecurityGroupRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRule =
        genForDeleteSecurityGroupRule();

    private static HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> genForDeleteSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSecurityGroupRuleRequest.class, DeleteSecurityGroupRuleResponse.class)
            .withName("DeleteSecurityGroupRule")
            .withUri("/v1/security-group-rules/{security_group_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupRuleRequest::getSecurityGroupRuleId,
                DeleteSecurityGroupRuleRequest::setSecurityGroupRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnet = genForDeleteSubnet();

    private static HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> genForDeleteSubnet() {
        // basic
        HttpRequestDef.Builder<DeleteSubnetRequest, DeleteSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubnetRequest.class, DeleteSubnetResponse.class)
                .withName("DeleteSubnet")
                .withUri("/v1/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetRequest::getSubnetId, DeleteSubnetRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> deleteVpc = genForDeleteVpc();

    private static HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> genForDeleteVpc() {
        // basic
        HttpRequestDef.Builder<DeleteVpcRequest, DeleteVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcRequest.class, DeleteVpcResponse.class)
                .withName("DeleteVpc")
                .withUri("/v1/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcRequest::getVpcId, DeleteVpcRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSubnetRequest, DisassociateSubnetResponse> disassociateSubnet =
        genForDisassociateSubnet();

    private static HttpRequestDef<DisassociateSubnetRequest, DisassociateSubnetResponse> genForDisassociateSubnet() {
        // basic
        HttpRequestDef.Builder<DisassociateSubnetRequest, DisassociateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateSubnetRequest.class, DisassociateSubnetResponse.class)
                .withName("DisassociateSubnet")
                .withUri("/v1/routetables/{routetable_id}/disassociate-subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSubnetRequest::getRoutetableId,
                DisassociateSubnetRequest::setRoutetableId));
        builder.<DisassociateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateSubnetRequestBody.class),
            f -> f.withMarshaller(DisassociateSubnetRequest::getBody, DisassociateSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDeploymentRequest, ExecuteDeploymentResponse> executeDeployment =
        genForExecuteDeployment();

    private static HttpRequestDef<ExecuteDeploymentRequest, ExecuteDeploymentResponse> genForExecuteDeployment() {
        // basic
        HttpRequestDef.Builder<ExecuteDeploymentRequest, ExecuteDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteDeploymentRequest.class, ExecuteDeploymentResponse.class)
                .withName("ExecuteDeployment")
                .withUri("/v1/deployments/{deployment_id}/deploy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDeploymentRequest::getDeploymentId,
                ExecuteDeploymentRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandEdgecloudRequest, ExpandEdgecloudResponse> expandEdgecloud =
        genForExpandEdgecloud();

    private static HttpRequestDef<ExpandEdgecloudRequest, ExpandEdgecloudResponse> genForExpandEdgecloud() {
        // basic
        HttpRequestDef.Builder<ExpandEdgecloudRequest, ExpandEdgecloudResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandEdgecloudRequest.class, ExpandEdgecloudResponse.class)
                .withName("ExpandEdgecloud")
                .withUri("/v1/deployments/{deployment_id}/expand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandEdgecloudRequest::getDeploymentId, ExpandEdgecloudRequest::setDeploymentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthTypesRequest, ListBandwidthTypesResponse> listBandwidthTypes =
        genForListBandwidthTypes();

    private static HttpRequestDef<ListBandwidthTypesRequest, ListBandwidthTypesResponse> genForListBandwidthTypes() {
        // basic
        HttpRequestDef.Builder<ListBandwidthTypesRequest, ListBandwidthTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthTypesRequest.class, ListBandwidthTypesResponse.class)
                .withName("ListBandwidthTypes")
                .withUri("/v1/share-bandwidth-types")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthTypesRequest::getLimit, ListBandwidthTypesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthTypesRequest::getOffset, ListBandwidthTypesRequest::setOffset));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTypesRequest::getSiteId, ListBandwidthTypesRequest::setSiteId));
        builder.<String>withRequestField("bandwidth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTypesRequest::getBandwidthType,
                ListBandwidthTypesRequest::setBandwidthType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidths =
        genForListBandwidths();

    private static HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> genForListBandwidths() {
        // basic
        HttpRequestDef.Builder<ListBandwidthsRequest, ListBandwidthsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthsRequest.class, ListBandwidthsResponse.class)
                .withName("ListBandwidths")
                .withUri("/v1/bandwidths")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getLimit, ListBandwidthsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getOffset, ListBandwidthsRequest::setOffset));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getSiteId, ListBandwidthsRequest::setSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudImagesRequest, ListCloudImagesResponse> listCloudImages =
        genForListCloudImages();

    private static HttpRequestDef<ListCloudImagesRequest, ListCloudImagesResponse> genForListCloudImages() {
        // basic
        HttpRequestDef.Builder<ListCloudImagesRequest, ListCloudImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCloudImagesRequest.class, ListCloudImagesResponse.class)
                .withName("ListCloudImages")
                .withUri("/v1/cloudimages/{region_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getRegionId, ListCloudImagesRequest::setRegionId));
        builder.<String>withRequestField("__imagetype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getImagetype, ListCloudImagesRequest::setImagetype));
        builder.<ListCloudImagesRequest.IsregisteredEnum>withRequestField("__isregistered",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.IsregisteredEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getIsregistered, ListCloudImagesRequest::setIsregistered));
        builder.<String>withRequestField("__os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getOsType, ListCloudImagesRequest::setOsType));
        builder.<String>withRequestField("__support_diskintensive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportDiskintensive,
                ListCloudImagesRequest::setSupportDiskintensive));
        builder.<String>withRequestField("__support_highperformance",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportHighperformance,
                ListCloudImagesRequest::setSupportHighperformance));
        builder.<String>withRequestField("__support_kvm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportKvm, ListCloudImagesRequest::setSupportKvm));
        builder.<String>withRequestField("__support_kvm_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportKvmGpuType,
                ListCloudImagesRequest::setSupportKvmGpuType));
        builder.<String>withRequestField("__support_kvm_infiniband",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportKvmInfiniband,
                ListCloudImagesRequest::setSupportKvmInfiniband));
        builder.<String>withRequestField("__support_largememory",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportLargememory,
                ListCloudImagesRequest::setSupportLargememory));
        builder.<String>withRequestField("__support_xen",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportXen, ListCloudImagesRequest::setSupportXen));
        builder.<String>withRequestField("__support_xen_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportXenGpuType,
                ListCloudImagesRequest::setSupportXenGpuType));
        builder.<String>withRequestField("__support_xen_hana",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportXenHana,
                ListCloudImagesRequest::setSupportXenHana));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getId, ListCloudImagesRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getLimit, ListCloudImagesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getMarker, ListCloudImagesRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getName, ListCloudImagesRequest::setName));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getOwner, ListCloudImagesRequest::setOwner));
        builder.<ListCloudImagesRequest.ProtectedEnum>withRequestField("protected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.ProtectedEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getProtected, ListCloudImagesRequest::setProtected));
        builder.<ListCloudImagesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSortDir, ListCloudImagesRequest::setSortDir));
        builder.<ListCloudImagesRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSortKey, ListCloudImagesRequest::setSortKey));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getStatus, ListCloudImagesRequest::setStatus));
        builder.<ListCloudImagesRequest.VirtualEnvTypeEnum>withRequestField("virtual_env_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.VirtualEnvTypeEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getVirtualEnvType,
                ListCloudImagesRequest::setVirtualEnvType));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getVisibility, ListCloudImagesRequest::setVisibility));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeploymentsRequest, ListDeploymentsResponse> listDeployments =
        genForListDeployments();

    private static HttpRequestDef<ListDeploymentsRequest, ListDeploymentsResponse> genForListDeployments() {
        // basic
        HttpRequestDef.Builder<ListDeploymentsRequest, ListDeploymentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeploymentsRequest.class, ListDeploymentsResponse.class)
                .withName("ListDeployments")
                .withUri("/v1/deployments")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getOffset, ListDeploymentsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getLimit, ListDeploymentsRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getStatus, ListDeploymentsRequest::setStatus));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getId, ListDeploymentsRequest::setId));
        builder.<String>withRequestField("edgecloud_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getEdgecloudId, ListDeploymentsRequest::setEdgecloudId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeCloudRequest, ListEdgeCloudResponse> listEdgeCloud =
        genForListEdgeCloud();

    private static HttpRequestDef<ListEdgeCloudRequest, ListEdgeCloudResponse> genForListEdgeCloud() {
        // basic
        HttpRequestDef.Builder<ListEdgeCloudRequest, ListEdgeCloudResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeCloudRequest.class, ListEdgeCloudResponse.class)
                .withName("ListEdgeCloud")
                .withUri("/v1/edgeclouds")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeCloudRequest::getOffset, ListEdgeCloudRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeCloudRequest::getLimit, ListEdgeCloudRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeCloudRequest::getName, ListEdgeCloudRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeCloudRequest::getId, ListEdgeCloudRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v1/cloudservers/flavors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getOffset, ListFlavorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, ListFlavorsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getName, ListFlavorsRequest::setName));
        builder.<String>withRequestField("area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getArea, ListFlavorsRequest::setArea));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getProvince, ListFlavorsRequest::setProvince));
        builder.<String>withRequestField("city",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCity, ListFlavorsRequest::setCity));
        builder.<String>withRequestField("operator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getOperator, ListFlavorsRequest::setOperator));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getId, ListFlavorsRequest::setId));
        builder.<String>withRequestField("site_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSiteIds, ListFlavorsRequest::setSiteIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForListImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForListImages() {
        // basic
        HttpRequestDef.Builder<ListImagesRequest, ListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesRequest.class, ListImagesResponse.class)
                .withName("ListImages")
                .withUri("/v1/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("__imagetype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImagetype, ListImagesRequest::setImagetype));
        builder.<ListImagesRequest.ProtectedEnum>withRequestField("protected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.ProtectedEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getProtected, ListImagesRequest::setProtected));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getId, ListImagesRequest::setId));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getVisibility, ListImagesRequest::setVisibility));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getStatus, ListImagesRequest::setStatus));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getName, ListImagesRequest::setName));
        builder.<String>withRequestField("__os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getOsType, ListImagesRequest::setOsType));
        builder.<ListImagesRequest.VirtualEnvTypeEnum>withRequestField("virtual_env_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.VirtualEnvTypeEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getVirtualEnvType, ListImagesRequest::setVirtualEnvType));
        builder.<ListImagesRequest.IsregisteredEnum>withRequestField("__isregistered",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.IsregisteredEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getIsregistered, ListImagesRequest::setIsregistered));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getLimit, ListImagesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getOffset, ListImagesRequest::setOffset));
        builder.<ListImagesRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getSortKey, ListImagesRequest::setSortKey));
        builder.<ListImagesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getSortDir, ListImagesRequest::setSortDir));
        builder.<String>withRequestField("__support_kvm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvm, ListImagesRequest::setSupportKvm));
        builder.<String>withRequestField("__support_kvm_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvmGpuType, ListImagesRequest::setSupportKvmGpuType));
        builder.<String>withRequestField("__support_kvm_ascend_310",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvmAscend310,
                ListImagesRequest::setSupportKvmAscend310));
        builder.<String>withRequestField("__support_kvm_hi1822_hiovs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvmHi1822Hiovs,
                ListImagesRequest::setSupportKvmHi1822Hiovs));
        builder.<String>withRequestField("__support_arm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportArm, ListImagesRequest::setSupportArm));
        builder.<String>withRequestField("__support_gpu_t4",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportGpuT4, ListImagesRequest::setSupportGpuT4));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v1/cloudservers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getStatus, ListInstancesRequest::setStatus));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<String>withRequestField("area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getArea, ListInstancesRequest::setArea));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getProvince, ListInstancesRequest::setProvince));
        builder.<String>withRequestField("city",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getCity, ListInstancesRequest::setCity));
        builder.<String>withRequestField("edgecloud_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getEdgecloudId, ListInstancesRequest::setEdgecloudId));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSiteId, ListInstancesRequest::setSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairsRequest, ListKeypairsResponse> listKeypairs = genForListKeypairs();

    private static HttpRequestDef<ListKeypairsRequest, ListKeypairsResponse> genForListKeypairs() {
        // basic
        HttpRequestDef.Builder<ListKeypairsRequest, ListKeypairsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeypairsRequest.class, ListKeypairsResponse.class)
                .withName("ListKeypairs")
                .withUri("/v1/os-keypairs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKeypairsRequest::getLimit, ListKeypairsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKeypairsRequest::getOffset, ListKeypairsRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeypairsRequest::getName, ListKeypairsRequest::setName));

        // response
        builder.<List<SimpleKeypair>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListKeypairsResponse::getBody, ListKeypairsResponse::setBody)
                .withInnerContainerType(SimpleKeypair.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForListPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForListPorts() {
        // basic
        HttpRequestDef.Builder<ListPortsRequest, ListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortsRequest.class, ListPortsResponse.class)
                .withName("ListPorts")
                .withUri("/v1/ports")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getLimit, ListPortsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getOffset, ListPortsRequest::setOffset));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getNetworkId, ListPortsRequest::setNetworkId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getId, ListPortsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getName, ListPortsRequest::setName));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPortsRequest::getAdminStateUp, ListPortsRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("fixed_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPortsRequest::getFixedIps, ListPortsRequest::setFixedIps));
        builder.<String>withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getMacAddress, ListPortsRequest::setMacAddress));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getDeviceId, ListPortsRequest::setDeviceId));
        builder.<String>withRequestField("device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getDeviceOwner, ListPortsRequest::setDeviceOwner));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getStatus, ListPortsRequest::setStatus));
        builder.<String>withRequestField("security_groups",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getSecurityGroups, ListPortsRequest::setSecurityGroups));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaRequest, ListQuotaResponse> listQuota = genForListQuota();

    private static HttpRequestDef<ListQuotaRequest, ListQuotaResponse> genForListQuota() {
        // basic
        HttpRequestDef.Builder<ListQuotaRequest, ListQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaRequest.class, ListQuotaResponse.class)
                .withName("ListQuota")
                .withUri("/v1/edgeclouds/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse> listRelatedRoutetables =
        genForListRelatedRoutetables();

    private static HttpRequestDef<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse> genForListRelatedRoutetables() {
        // basic
        HttpRequestDef.Builder<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRelatedRoutetablesRequest.class, ListRelatedRoutetablesResponse.class)
            .withName("ListRelatedRoutetables")
            .withUri("/v1/subnets/{subnet_id}/routetables")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelatedRoutetablesRequest::getSubnetId,
                ListRelatedRoutetablesRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutesRequest, ListRoutesResponse> listRoutes = genForListRoutes();

    private static HttpRequestDef<ListRoutesRequest, ListRoutesResponse> genForListRoutes() {
        // basic
        HttpRequestDef.Builder<ListRoutesRequest, ListRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoutesRequest.class, ListRoutesResponse.class)
                .withName("ListRoutes")
                .withUri("/v1/routetables/{routetable_id}/routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutesRequest::getRoutetableId, ListRoutesRequest::setRoutetableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutetablesRequest, ListRoutetablesResponse> listRoutetables =
        genForListRoutetables();

    private static HttpRequestDef<ListRoutetablesRequest, ListRoutetablesResponse> genForListRoutetables() {
        // basic
        HttpRequestDef.Builder<ListRoutetablesRequest, ListRoutetablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoutetablesRequest.class, ListRoutetablesResponse.class)
                .withName("ListRoutetables")
                .withUri("/v1/routetables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getId, ListRoutetablesRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getLimit, ListRoutetablesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getName, ListRoutetablesRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getOffset, ListRoutetablesRequest::setOffset));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getVpcId, ListRoutetablesRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRules =
        genForListSecurityGroupRules();

    private static HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> genForListSecurityGroupRules() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSecurityGroupRulesRequest.class, ListSecurityGroupRulesResponse.class)
            .withName("ListSecurityGroupRules")
            .withUri("/v1/security-group-rules")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getLimit, ListSecurityGroupRulesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getOffset, ListSecurityGroupRulesRequest::setOffset));
        builder.<String>withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getSecurityGroupId,
                ListSecurityGroupRulesRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroups =
        genForListSecurityGroups();

    private static HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> genForListSecurityGroups() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupsRequest, ListSecurityGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityGroupsRequest.class, ListSecurityGroupsResponse.class)
                .withName("ListSecurityGroups")
                .withUri("/v1/security-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getLimit, ListSecurityGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getOffset, ListSecurityGroupsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSitesRequest, ListSitesResponse> listSites = genForListSites();

    private static HttpRequestDef<ListSitesRequest, ListSitesResponse> genForListSites() {
        // basic
        HttpRequestDef.Builder<ListSitesRequest, ListSitesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSitesRequest.class, ListSitesResponse.class)
                .withName("ListSites")
                .withUri("/v1/sites")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSitesRequest::getLimit, ListSitesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSitesRequest::getOffset, ListSitesRequest::setOffset));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getId, ListSitesRequest::setId));
        builder.<String>withRequestField("area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getArea, ListSitesRequest::setArea));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getProvince, ListSitesRequest::setProvince));
        builder.<String>withRequestField("city",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getCity, ListSitesRequest::setCity));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getFlavor, ListSitesRequest::setFlavor));
        builder.<ListSitesRequest.VolumeTypeEnum>withRequestField("volume_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSitesRequest.VolumeTypeEnum.class),
            f -> f.withMarshaller(ListSitesRequest::getVolumeType, ListSitesRequest::setVolumeType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> listSubnets = genForListSubnets();

    private static HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> genForListSubnets() {
        // basic
        HttpRequestDef.Builder<ListSubnetsRequest, ListSubnetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubnetsRequest.class, ListSubnetsResponse.class)
                .withName("ListSubnets")
                .withUri("/v1/subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getVpcId, ListSubnetsRequest::setVpcId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubnetsRequest::getLimit, ListSubnetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubnetsRequest::getOffset, ListSubnetsRequest::setOffset));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getSiteId, ListSubnetsRequest::setSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeRequest, ListVolumeResponse> listVolume = genForListVolume();

    private static HttpRequestDef<ListVolumeRequest, ListVolumeResponse> genForListVolume() {
        // basic
        HttpRequestDef.Builder<ListVolumeRequest, ListVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVolumeRequest.class, ListVolumeResponse.class)
                .withName("ListVolume")
                .withUri("/v1/cloudvolumes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumeRequest::getLimit, ListVolumeRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumeRequest::getName, ListVolumeRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumeRequest::getOffset, ListVolumeRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumeRequest::getStatus, ListVolumeRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcsRequest, ListVpcsResponse> listVpcs = genForListVpcs();

    private static HttpRequestDef<ListVpcsRequest, ListVpcsResponse> genForListVpcs() {
        // basic
        HttpRequestDef.Builder<ListVpcsRequest, ListVpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcsRequest.class, ListVpcsResponse.class)
                .withName("ListVpcs")
                .withUri("/v1/vpcs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcsRequest::getLimit, ListVpcsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcsRequest::getOffset, ListVpcsRequest::setOffset));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getId, ListVpcsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getName, ListVpcsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebuildImageRequest, RebuildImageResponse> rebuildImage = genForRebuildImage();

    private static HttpRequestDef<RebuildImageRequest, RebuildImageResponse> genForRebuildImage() {
        // basic
        HttpRequestDef.Builder<RebuildImageRequest, RebuildImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebuildImageRequest.class, RebuildImageResponse.class)
                .withName("RebuildImage")
                .withUri("/v1/{domain_id}/jobs/{job_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebuildImageRequest::getJobId, RebuildImageRequest::setJobId));
        builder.<RebuildImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RebuildImageRequestBody.class),
            f -> f.withMarshaller(RebuildImageRequest::getBody, RebuildImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterImageRequest, RegisterImageResponse> registerImage =
        genForRegisterImage();

    private static HttpRequestDef<RegisterImageRequest, RegisterImageResponse> genForRegisterImage() {
        // basic
        HttpRequestDef.Builder<RegisterImageRequest, RegisterImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterImageRequest.class, RegisterImageResponse.class)
                .withName("RegisterImage")
                .withUri("/v1/images/register")
                .withContentType("application/json");

        // requests
        builder.<RegisterImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterImageRequestBody.class),
            f -> f.withMarshaller(RegisterImageRequest::getBody, RegisterImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidth =
        genForShowBandwidth();

    private static HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> genForShowBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthRequest, ShowBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthRequest.class, ShowBandwidthResponse.class)
                .withName("ShowBandwidth")
                .withUri("/v1/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthRequest::getBandwidthId, ShowBandwidthRequest::setBandwidthId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeCloudRequest, ShowEdgeCloudResponse> showEdgeCloud =
        genForShowEdgeCloud();

    private static HttpRequestDef<ShowEdgeCloudRequest, ShowEdgeCloudResponse> genForShowEdgeCloud() {
        // basic
        HttpRequestDef.Builder<ShowEdgeCloudRequest, ShowEdgeCloudResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeCloudRequest.class, ShowEdgeCloudResponse.class)
                .withName("ShowEdgeCloud")
                .withUri("/v1/edgeclouds/{edgecloud_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edgecloud_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeCloudRequest::getEdgecloudId, ShowEdgeCloudRequest::setEdgecloudId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageRequest, ShowImageResponse> showImage = genForShowImage();

    private static HttpRequestDef<ShowImageRequest, ShowImageResponse> genForShowImage() {
        // basic
        HttpRequestDef.Builder<ShowImageRequest, ShowImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageRequest.class, ShowImageResponse.class)
                .withName("ShowImage")
                .withUri("/v1/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageRequest::getImageId, ShowImageRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/cloudservers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getServerId, ShowInstanceRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKeypairRequest, ShowKeypairResponse> showKeypair = genForShowKeypair();

    private static HttpRequestDef<ShowKeypairRequest, ShowKeypairResponse> genForShowKeypair() {
        // basic
        HttpRequestDef.Builder<ShowKeypairRequest, ShowKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKeypairRequest.class, ShowKeypairResponse.class)
                .withName("ShowKeypair")
                .withUri("/v1/os-keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKeypairRequest::getKeypairName, ShowKeypairRequest::setKeypairName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPortRequest, ShowPortResponse> showPort = genForShowPort();

    private static HttpRequestDef<ShowPortRequest, ShowPortResponse> genForShowPort() {
        // basic
        HttpRequestDef.Builder<ShowPortRequest, ShowPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPortRequest.class, ShowPortResponse.class)
                .withName("ShowPort")
                .withUri("/v1/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPortRequest::getPortId, ShowPortRequest::setPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoutetableRequest, ShowRoutetableResponse> showRoutetable =
        genForShowRoutetable();

    private static HttpRequestDef<ShowRoutetableRequest, ShowRoutetableResponse> genForShowRoutetable() {
        // basic
        HttpRequestDef.Builder<ShowRoutetableRequest, ShowRoutetableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRoutetableRequest.class, ShowRoutetableResponse.class)
                .withName("ShowRoutetable")
                .withUri("/v1/routetables/{routetable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutetableRequest::getRoutetableId, ShowRoutetableRequest::setRoutetableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroup =
        genForShowSecurityGroup();

    private static HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> genForShowSecurityGroup() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupRequest, ShowSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecurityGroupRequest.class, ShowSecurityGroupResponse.class)
                .withName("ShowSecurityGroup")
                .withUri("/v1/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityGroupRequest::getSecurityGroupId,
                ShowSecurityGroupRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRule =
        genForShowSecurityGroupRule();

    private static HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> genForShowSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSecurityGroupRuleRequest.class, ShowSecurityGroupRuleResponse.class)
            .withName("ShowSecurityGroupRule")
            .withUri("/v1/security-group-rules/{security_group_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityGroupRuleRequest::getSecurityGroupRuleId,
                ShowSecurityGroupRuleRequest::setSecurityGroupRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> showSubnet = genForShowSubnet();

    private static HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> genForShowSubnet() {
        // basic
        HttpRequestDef.Builder<ShowSubnetRequest, ShowSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubnetRequest.class, ShowSubnetResponse.class)
                .withName("ShowSubnet")
                .withUri("/v1/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubnetRequest::getSubnetId, ShowSubnetRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> showVolume = genForShowVolume();

    private static HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> genForShowVolume() {
        // basic
        HttpRequestDef.Builder<ShowVolumeRequest, ShowVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeRequest.class, ShowVolumeResponse.class)
                .withName("ShowVolume")
                .withUri("/v1/cloudvolumes/{volume_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVolumeRequest::getVolumeId, ShowVolumeRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeTypesRequest, ShowVolumeTypesResponse> showVolumeTypes =
        genForShowVolumeTypes();

    private static HttpRequestDef<ShowVolumeTypesRequest, ShowVolumeTypesResponse> genForShowVolumeTypes() {
        // basic
        HttpRequestDef.Builder<ShowVolumeTypesRequest, ShowVolumeTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeTypesRequest.class, ShowVolumeTypesResponse.class)
                .withName("ShowVolumeTypes")
                .withUri("/v1/cloudvolumes/volume-types")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRequest, ShowVpcResponse> showVpc = genForShowVpc();

    private static HttpRequestDef<ShowVpcRequest, ShowVpcResponse> genForShowVpc() {
        // basic
        HttpRequestDef.Builder<ShowVpcRequest, ShowVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcRequest.class, ShowVpcResponse.class)
                .withName("ShowVpc")
                .withUri("/v1/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcRequest::getVpcId, ShowVpcRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidth =
        genForUpdateBandwidth();

    private static HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> genForUpdateBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthRequest, UpdateBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBandwidthRequest.class, UpdateBandwidthResponse.class)
                .withName("UpdateBandwidth")
                .withUri("/v1/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBandwidthId, UpdateBandwidthRequest::setBandwidthId));
        builder.<UpdateBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBody, UpdateBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v1/cloudservers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getServerId, UpdateInstanceRequest::setServerId));
        builder.<UpdateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortRequest, UpdatePortResponse> updatePort = genForUpdatePort();

    private static HttpRequestDef<UpdatePortRequest, UpdatePortResponse> genForUpdatePort() {
        // basic
        HttpRequestDef.Builder<UpdatePortRequest, UpdatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePortRequest.class, UpdatePortResponse.class)
                .withName("UpdatePort")
                .withUri("/v1/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePortRequest::getPortId, UpdatePortRequest::setPortId));
        builder.<UpdatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortRequestBody.class),
            f -> f.withMarshaller(UpdatePortRequest::getBody, UpdatePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutes = genForUpdateRoutes();

    private static HttpRequestDef<UpdateRoutesRequest, UpdateRoutesResponse> genForUpdateRoutes() {
        // basic
        HttpRequestDef.Builder<UpdateRoutesRequest, UpdateRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateRoutesRequest.class, UpdateRoutesResponse.class)
                .withName("UpdateRoutes")
                .withUri("/v1/routetables/{routetable_id}/update-routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutesRequest::getRoutetableId, UpdateRoutesRequest::setRoutetableId));
        builder.<UpdateRoutesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRoutesRequestBody.class),
            f -> f.withMarshaller(UpdateRoutesRequest::getBody, UpdateRoutesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutetableRequest, UpdateRoutetableResponse> updateRoutetable =
        genForUpdateRoutetable();

    private static HttpRequestDef<UpdateRoutetableRequest, UpdateRoutetableResponse> genForUpdateRoutetable() {
        // basic
        HttpRequestDef.Builder<UpdateRoutetableRequest, UpdateRoutetableResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRoutetableRequest.class, UpdateRoutetableResponse.class)
                .withName("UpdateRoutetable")
                .withUri("/v1/routetables/{routetable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutetableRequest::getRoutetableId, UpdateRoutetableRequest::setRoutetableId));
        builder.<UpdateRoutetableRequesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRoutetableRequesBody.class),
            f -> f.withMarshaller(UpdateRoutetableRequest::getBody, UpdateRoutetableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnet = genForUpdateSubnet();

    private static HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> genForUpdateSubnet() {
        // basic
        HttpRequestDef.Builder<UpdateSubnetRequest, UpdateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubnetRequest.class, UpdateSubnetResponse.class)
                .withName("UpdateSubnet")
                .withUri("/v1/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getSubnetId, UpdateSubnetRequest::setSubnetId));
        builder.<UpdateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubnetRequestBody.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getBody, UpdateSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> updateVpc = genForUpdateVpc();

    private static HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> genForUpdateVpc() {
        // basic
        HttpRequestDef.Builder<UpdateVpcRequest, UpdateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcRequest.class, UpdateVpcResponse.class)
                .withName("UpdateVpc")
                .withUri("/v1/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcRequest::getVpcId, UpdateVpcRequest::setVpcId));
        builder.<UpdateVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcRequestBody.class),
            f -> f.withMarshaller(UpdateVpcRequest::getBody, UpdateVpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> createFirewall =
        genForCreateFirewall();

    private static HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> genForCreateFirewall() {
        // basic
        HttpRequestDef.Builder<CreateFirewallRequest, CreateFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFirewallRequest.class, CreateFirewallResponse.class)
                .withName("CreateFirewall")
                .withUri("/v1/firewalls")
                .withContentType("application/json");

        // requests
        builder.<CreateFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFirewallRequestBody.class),
            f -> f.withMarshaller(CreateFirewallRequest::getBody, CreateFirewallRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewall =
        genForDeleteFirewall();

    private static HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> genForDeleteFirewall() {
        // basic
        HttpRequestDef.Builder<DeleteFirewallRequest, DeleteFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFirewallRequest.class, DeleteFirewallResponse.class)
                .withName("DeleteFirewall")
                .withUri("/v1/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFirewallRequest::getFirewallId, DeleteFirewallRequest::setFirewallId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallsRequest, ListFirewallsResponse> listFirewalls =
        genForListFirewalls();

    private static HttpRequestDef<ListFirewallsRequest, ListFirewallsResponse> genForListFirewalls() {
        // basic
        HttpRequestDef.Builder<ListFirewallsRequest, ListFirewallsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFirewallsRequest.class, ListFirewallsResponse.class)
                .withName("ListFirewalls")
                .withUri("/v1/firewalls")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallsRequest::getLimit, ListFirewallsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallsRequest::getOffset, ListFirewallsRequest::setOffset));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallsRequest::getId, ListFirewallsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallsRequest::getName, ListFirewallsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFirewallRequest, ShowFirewallResponse> showFirewall = genForShowFirewall();

    private static HttpRequestDef<ShowFirewallRequest, ShowFirewallResponse> genForShowFirewall() {
        // basic
        HttpRequestDef.Builder<ShowFirewallRequest, ShowFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFirewallRequest.class, ShowFirewallResponse.class)
                .withName("ShowFirewall")
                .withUri("/v1/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFirewallRequest::getFirewallId, ShowFirewallRequest::setFirewallId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewall =
        genForUpdateFirewall();

    private static HttpRequestDef<UpdateFirewallRequest, UpdateFirewallResponse> genForUpdateFirewall() {
        // basic
        HttpRequestDef.Builder<UpdateFirewallRequest, UpdateFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFirewallRequest.class, UpdateFirewallResponse.class)
                .withName("UpdateFirewall")
                .withUri("/v1/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFirewallRequest::getFirewallId, UpdateFirewallRequest::setFirewallId));
        builder.<UpdateFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFirewallRequestBody.class),
            f -> f.withMarshaller(UpdateFirewallRequest::getBody, UpdateFirewallRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> updateFirewallRule =
        genForUpdateFirewallRule();

    private static HttpRequestDef<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> genForUpdateFirewallRule() {
        // basic
        HttpRequestDef.Builder<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFirewallRuleRequest.class, UpdateFirewallRuleResponse.class)
                .withName("UpdateFirewallRule")
                .withUri("/v1/firewalls/{firewall_id}/firewall-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFirewallRuleRequest::getFirewallId, UpdateFirewallRuleRequest::setFirewallId));
        builder.<UpdateFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFirewallRuleRequestBody.class),
            f -> f.withMarshaller(UpdateFirewallRuleRequest::getBody, UpdateFirewallRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicIpRequest, CreatePublicIpResponse> createPublicIp =
        genForCreatePublicIp();

    private static HttpRequestDef<CreatePublicIpRequest, CreatePublicIpResponse> genForCreatePublicIp() {
        // basic
        HttpRequestDef.Builder<CreatePublicIpRequest, CreatePublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublicIpRequest.class, CreatePublicIpResponse.class)
                .withName("CreatePublicIp")
                .withUri("/v1/publicips")
                .withContentType("application/json");

        // requests
        builder.<CreatePublicIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicIpRequestBody.class),
            f -> f.withMarshaller(CreatePublicIpRequest::getBody, CreatePublicIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicIpRequest, DeletePublicIpResponse> deletePublicIp =
        genForDeletePublicIp();

    private static HttpRequestDef<DeletePublicIpRequest, DeletePublicIpResponse> genForDeletePublicIp() {
        // basic
        HttpRequestDef.Builder<DeletePublicIpRequest, DeletePublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublicIpRequest.class, DeletePublicIpResponse.class)
                .withName("DeletePublicIp")
                .withUri("/v1/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublicIpRequest::getPublicipId, DeletePublicIpRequest::setPublicipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicIpsRequest, ListPublicIpsResponse> listPublicIps =
        genForListPublicIps();

    private static HttpRequestDef<ListPublicIpsRequest, ListPublicIpsResponse> genForListPublicIps() {
        // basic
        HttpRequestDef.Builder<ListPublicIpsRequest, ListPublicIpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicIpsRequest.class, ListPublicIpsResponse.class)
                .withName("ListPublicIps")
                .withUri("/v1/publicips")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicIpsRequest::getLimit, ListPublicIpsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicIpsRequest::getOffset, ListPublicIpsRequest::setOffset));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicIpsRequest::getSiteId, ListPublicIpsRequest::setSiteId));
        builder.<String>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicIpsRequest::getPortId, ListPublicIpsRequest::setPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicIpRequest, ShowPublicIpResponse> showPublicIp = genForShowPublicIp();

    private static HttpRequestDef<ShowPublicIpRequest, ShowPublicIpResponse> genForShowPublicIp() {
        // basic
        HttpRequestDef.Builder<ShowPublicIpRequest, ShowPublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicIpRequest.class, ShowPublicIpResponse.class)
                .withName("ShowPublicIp")
                .withUri("/v1/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicIpRequest::getPublicipId, ShowPublicIpRequest::setPublicipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicIpRequest, UpdatePublicIpResponse> updatePublicIp =
        genForUpdatePublicIp();

    private static HttpRequestDef<UpdatePublicIpRequest, UpdatePublicIpResponse> genForUpdatePublicIp() {
        // basic
        HttpRequestDef.Builder<UpdatePublicIpRequest, UpdatePublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePublicIpRequest.class, UpdatePublicIpResponse.class)
                .withName("UpdatePublicIp")
                .withUri("/v1/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicIpRequest::getPublicipId, UpdatePublicIpRequest::setPublicipId));
        builder.<UpdatePublicIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicIpRequestBody.class),
            f -> f.withMarshaller(UpdatePublicIpRequest::getBody, UpdatePublicIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachVipBandwidthRequest, AttachVipBandwidthResponse> attachVipBandwidth =
        genForAttachVipBandwidth();

    private static HttpRequestDef<AttachVipBandwidthRequest, AttachVipBandwidthResponse> genForAttachVipBandwidth() {
        // basic
        HttpRequestDef.Builder<AttachVipBandwidthRequest, AttachVipBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachVipBandwidthRequest.class, AttachVipBandwidthResponse.class)
                .withName("AttachVipBandwidth")
                .withUri("/v1/vports/{vport_id}/bandwidth/attach")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vport_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachVipBandwidthRequest::getVportId, AttachVipBandwidthRequest::setVportId));
        builder.<AttachVipBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachVipBandwidthRequestBody.class),
            f -> f.withMarshaller(AttachVipBandwidthRequest::getBody, AttachVipBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachVipBandwidthRequest, DetachVipBandwidthResponse> detachVipBandwidth =
        genForDetachVipBandwidth();

    private static HttpRequestDef<DetachVipBandwidthRequest, DetachVipBandwidthResponse> genForDetachVipBandwidth() {
        // basic
        HttpRequestDef.Builder<DetachVipBandwidthRequest, DetachVipBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachVipBandwidthRequest.class, DetachVipBandwidthResponse.class)
                .withName("DetachVipBandwidth")
                .withUri("/v1/vports/{vport_id}/bandwidth/detach")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vport_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachVipBandwidthRequest::getVportId, DetachVipBandwidthRequest::setVportId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubnetRequest, CreateSubnetResponse> createSubnet = genForCreateSubnet();

    private static HttpRequestDef<CreateSubnetRequest, CreateSubnetResponse> genForCreateSubnet() {
        // basic
        HttpRequestDef.Builder<CreateSubnetRequest, CreateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubnetRequest.class, CreateSubnetResponse.class)
                .withName("CreateSubnet")
                .withUri("/v1/subnets")
                .withContentType("application/json");

        // requests
        builder.<CreateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubnetRequestBody.class),
            f -> f.withMarshaller(CreateSubnetRequest::getBody, CreateSubnetRequest::setBody));

        // response

        return builder.build();
    }

}
