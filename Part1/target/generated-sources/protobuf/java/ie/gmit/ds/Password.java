// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: password.proto

package ie.gmit.ds;

public final class Password {
  private Password() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ie_gmit_ds_HashInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ie_gmit_ds_HashInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ie_gmit_ds_HashOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ie_gmit_ds_HashOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ie_gmit_ds_ValidInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ie_gmit_ds_ValidInput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016password.proto\022\nie.gmit.ds\032\036google/pro" +
      "tobuf/wrappers.proto\"-\n\tHashInput\022\016\n\006use" +
      "rId\030\001 \001(\005\022\020\n\010password\030\002 \001(\t\"B\n\nHashOutpu" +
      "t\022\016\n\006userId\030\001 \001(\005\022\026\n\016hashedPassword\030\002 \001(" +
      "\014\022\014\n\004salt\030\003 \001(\014\"D\n\nValidInput\022\020\n\010passwor" +
      "d\030\001 \001(\t\022\026\n\016hashedPassword\030\002 \001(\014\022\014\n\004salt\030" +
      "\003 \001(\0142\210\001\n\017PasswordService\0225\n\004hash\022\025.ie.g" +
      "mit.ds.HashInput\032\026.ie.gmit.ds.HashOutput" +
      "\022>\n\010validate\022\026.ie.gmit.ds.ValidInput\032\032.g" +
      "oogle.protobuf.BoolValueB\016\n\nie.gmit.dsP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_ie_gmit_ds_HashInput_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ie_gmit_ds_HashInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ie_gmit_ds_HashInput_descriptor,
        new java.lang.String[] { "UserId", "Password", });
    internal_static_ie_gmit_ds_HashOutput_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ie_gmit_ds_HashOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ie_gmit_ds_HashOutput_descriptor,
        new java.lang.String[] { "UserId", "HashedPassword", "Salt", });
    internal_static_ie_gmit_ds_ValidInput_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ie_gmit_ds_ValidInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ie_gmit_ds_ValidInput_descriptor,
        new java.lang.String[] { "Password", "HashedPassword", "Salt", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
