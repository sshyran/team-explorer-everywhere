// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.types.AnyContentType;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._ClientService3Soap_Update;
import ms.tfs.workitemtracking.clientservices._03._MetadataTableHaveEntry;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ClientService3Soap_Update
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected AnyContentType _package;
    protected _MetadataTableHaveEntry[] metadataHave;

    public _ClientService3Soap_Update()
    {
        super();
    }

    public _ClientService3Soap_Update(
        final AnyContentType _package,
        final _MetadataTableHaveEntry[] metadataHave)
    {
        // TODO : Call super() instead of setting all fields directly?
        set_package(_package);
        setMetadataHave(metadataHave);
    }

    public AnyContentType get_package()
    {
        return this._package;
    }

    public void set_package(AnyContentType value)
    {
        this._package = value;
    }

    public _MetadataTableHaveEntry[] getMetadataHave()
    {
        return this.metadataHave;
    }

    public void setMetadataHave(_MetadataTableHaveEntry[] value)
    {
        this.metadataHave = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        this._package.writeAsElement(
            writer,
            "package");

        if (this.metadataHave != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("metadataHave");

            for (int iterator0 = 0; iterator0 < this.metadataHave.length; iterator0++)
            {
                this.metadataHave[iterator0].writeAsElement(
                    writer,
                    "MetadataTableHaveEntry");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
