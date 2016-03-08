// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._ReportingService2005Soap_FireEvent;

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
public class _ReportingService2005Soap_FireEvent
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String eventType;
    protected String eventData;

    public _ReportingService2005Soap_FireEvent()
    {
        super();
    }

    public _ReportingService2005Soap_FireEvent(
        final String eventType,
        final String eventData)
    {
        // TODO : Call super() instead of setting all fields directly?
        setEventType(eventType);
        setEventData(eventData);
    }

    public String getEventType()
    {
        return this.eventType;
    }

    public void setEventType(String value)
    {
        this.eventType = value;
    }

    public String getEventData()
    {
        return this.eventData;
    }

    public void setEventData(String value)
    {
        this.eventData = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "EventType",
            this.eventType);
        XMLStreamWriterHelper.writeElement(
            writer,
            "EventData",
            this.eventData);

        writer.writeEndElement();
    }
}