// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._Failure;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._MergeSource;
import ms.tfs.versioncontrol.clientservices._03._PendingChange;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._ReconcileResult;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._SeverityType;
import ms.tfs.versioncontrol.clientservices._03._Warning;
import ms.tfs.versioncontrol.clientservices._03._WarningType;

import java.lang.Object;
import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ReconcileResult
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String newSignature;
    protected boolean pendingChangesUpdated;
    protected boolean replayLocalVersionsRequired;
    protected _PendingChange[] newPendingChanges;
    protected _Failure[] failures;

    public _ReconcileResult()
    {
        super();
    }

    public _ReconcileResult(
        final String newSignature,
        final boolean pendingChangesUpdated,
        final boolean replayLocalVersionsRequired,
        final _PendingChange[] newPendingChanges,
        final _Failure[] failures)
    {
        // TODO : Call super() instead of setting all fields directly?
        setNewSignature(newSignature);
        setPendingChangesUpdated(pendingChangesUpdated);
        setReplayLocalVersionsRequired(replayLocalVersionsRequired);
        setNewPendingChanges(newPendingChanges);
        setFailures(failures);
    }

    public String getNewSignature()
    {
        return this.newSignature;
    }

    public void setNewSignature(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'NewSignature' is a required element, its value cannot be null");
        }

        this.newSignature = value;
    }

    public boolean isPendingChangesUpdated()
    {
        return this.pendingChangesUpdated;
    }

    public void setPendingChangesUpdated(boolean value)
    {
        this.pendingChangesUpdated = value;
    }

    public boolean isReplayLocalVersionsRequired()
    {
        return this.replayLocalVersionsRequired;
    }

    public void setReplayLocalVersionsRequired(boolean value)
    {
        this.replayLocalVersionsRequired = value;
    }

    public _PendingChange[] getNewPendingChanges()
    {
        return this.newPendingChanges;
    }

    public void setNewPendingChanges(_PendingChange[] value)
    {
        this.newPendingChanges = value;
    }

    public _Failure[] getFailures()
    {
        return this.failures;
    }

    public void setFailures(_Failure[] value)
    {
        this.failures = value;
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
            "NewSignature",
            this.newSignature);
        XMLStreamWriterHelper.writeElement(
            writer,
            "PendingChangesUpdated",
            this.pendingChangesUpdated);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ReplayLocalVersionsRequired",
            this.replayLocalVersionsRequired);

        if (this.newPendingChanges != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("NewPendingChanges");

            for (int iterator0 = 0; iterator0 < this.newPendingChanges.length; iterator0++)
            {
                this.newPendingChanges[iterator0].writeAsElement(
                    writer,
                    "PendingChange");
            }

            writer.writeEndElement();
        }

        if (this.failures != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Failures");

            for (int iterator0 = 0; iterator0 < this.failures.length; iterator0++)
            {
                this.failures[iterator0].writeAsElement(
                    writer,
                    "Failure");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("NewSignature"))
                {
                    this.newSignature = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("PendingChangesUpdated"))
                {
                    this.pendingChangesUpdated = XMLConvert.toBoolean(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("ReplayLocalVersionsRequired"))
                {
                    this.replayLocalVersionsRequired = XMLConvert.toBoolean(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("NewPendingChanges"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _PendingChange complexObject0 = new _PendingChange();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.newPendingChanges = (_PendingChange[]) list0.toArray(new _PendingChange[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Failures"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _Failure complexObject0 = new _Failure();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.failures = (_Failure[]) list0.toArray(new _Failure[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}