<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ThriftHiveMetastore_add_write_ids_to_min_history_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'txnId',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'writeIds',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::I64,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::I64,
                ),
        ),
    );

    /**
     * @var int
     */
    public $txnId = null;
    /**
     * @var array
     */
    public $writeIds = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['txnId'])) {
                $this->txnId = $vals['txnId'];
            }
            if (isset($vals['writeIds'])) {
                $this->writeIds = $vals['writeIds'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_add_write_ids_to_min_history_args';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->txnId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::MAP) {
                        $this->writeIds = array();
                        $_size1827 = 0;
                        $_ktype1828 = 0;
                        $_vtype1829 = 0;
                        $xfer += $input->readMapBegin($_ktype1828, $_vtype1829, $_size1827);
                        for ($_i1831 = 0; $_i1831 < $_size1827; ++$_i1831) {
                            $key1832 = '';
                            $val1833 = 0;
                            $xfer += $input->readString($key1832);
                            $xfer += $input->readI64($val1833);
                            $this->writeIds[$key1832] = $val1833;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_add_write_ids_to_min_history_args');
        if ($this->txnId !== null) {
            $xfer += $output->writeFieldBegin('txnId', TType::I64, 1);
            $xfer += $output->writeI64($this->txnId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->writeIds !== null) {
            if (!is_array($this->writeIds)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('writeIds', TType::MAP, 2);
            $output->writeMapBegin(TType::STRING, TType::I64, count($this->writeIds));
            foreach ($this->writeIds as $kiter1834 => $viter1835) {
                $xfer += $output->writeString($kiter1834);
                $xfer += $output->writeI64($viter1835);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
