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

class SkewedInfo
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'skewedColNames',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        2 => array(
            'var' => 'skewedColValues',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::LST,
            'elem' => array(
                'type' => TType::LST,
                'etype' => TType::STRING,
                'elem' => array(
                    'type' => TType::STRING,
                    ),
                ),
        ),
        3 => array(
            'var' => 'skewedColValueLocationMaps',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::LST,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::LST,
                'etype' => TType::STRING,
                'elem' => array(
                    'type' => TType::STRING,
                    ),
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string[]
     */
    public $skewedColNames = null;
    /**
     * @var (string[])[]
     */
    public $skewedColValues = null;
    /**
     * @var array
     */
    public $skewedColValueLocationMaps = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['skewedColNames'])) {
                $this->skewedColNames = $vals['skewedColNames'];
            }
            if (isset($vals['skewedColValues'])) {
                $this->skewedColValues = $vals['skewedColValues'];
            }
            if (isset($vals['skewedColValueLocationMaps'])) {
                $this->skewedColValueLocationMaps = $vals['skewedColValueLocationMaps'];
            }
        }
    }

    public function getName()
    {
        return 'SkewedInfo';
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
                    if ($ftype == TType::LST) {
                        $this->skewedColNames = array();
                        $_size200 = 0;
                        $_etype203 = 0;
                        $xfer += $input->readListBegin($_etype203, $_size200);
                        for ($_i204 = 0; $_i204 < $_size200; ++$_i204) {
                            $elem205 = null;
                            $xfer += $input->readString($elem205);
                            $this->skewedColNames []= $elem205;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->skewedColValues = array();
                        $_size206 = 0;
                        $_etype209 = 0;
                        $xfer += $input->readListBegin($_etype209, $_size206);
                        for ($_i210 = 0; $_i210 < $_size206; ++$_i210) {
                            $elem211 = null;
                            $elem211 = array();
                            $_size212 = 0;
                            $_etype215 = 0;
                            $xfer += $input->readListBegin($_etype215, $_size212);
                            for ($_i216 = 0; $_i216 < $_size212; ++$_i216) {
                                $elem217 = null;
                                $xfer += $input->readString($elem217);
                                $elem211 []= $elem217;
                            }
                            $xfer += $input->readListEnd();
                            $this->skewedColValues []= $elem211;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::MAP) {
                        $this->skewedColValueLocationMaps = array();
                        $_size218 = 0;
                        $_ktype219 = 0;
                        $_vtype220 = 0;
                        $xfer += $input->readMapBegin($_ktype219, $_vtype220, $_size218);
                        for ($_i222 = 0; $_i222 < $_size218; ++$_i222) {
                            $key223 = array();
                            $val224 = '';
                            $key223 = array();
                            $_size225 = 0;
                            $_etype228 = 0;
                            $xfer += $input->readListBegin($_etype228, $_size225);
                            for ($_i229 = 0; $_i229 < $_size225; ++$_i229) {
                                $elem230 = null;
                                $xfer += $input->readString($elem230);
                                $key223 []= $elem230;
                            }
                            $xfer += $input->readListEnd();
                            $xfer += $input->readString($val224);
                            $this->skewedColValueLocationMaps[$key223] = $val224;
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
        $xfer += $output->writeStructBegin('SkewedInfo');
        if ($this->skewedColNames !== null) {
            if (!is_array($this->skewedColNames)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('skewedColNames', TType::LST, 1);
            $output->writeListBegin(TType::STRING, count($this->skewedColNames));
            foreach ($this->skewedColNames as $iter231) {
                $xfer += $output->writeString($iter231);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->skewedColValues !== null) {
            if (!is_array($this->skewedColValues)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('skewedColValues', TType::LST, 2);
            $output->writeListBegin(TType::LST, count($this->skewedColValues));
            foreach ($this->skewedColValues as $iter232) {
                $output->writeListBegin(TType::STRING, count($iter232));
                foreach ($iter232 as $iter233) {
                    $xfer += $output->writeString($iter233);
                }
                $output->writeListEnd();
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->skewedColValueLocationMaps !== null) {
            if (!is_array($this->skewedColValueLocationMaps)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('skewedColValueLocationMaps', TType::MAP, 3);
            $output->writeMapBegin(TType::LST, TType::STRING, count($this->skewedColValueLocationMaps));
            foreach ($this->skewedColValueLocationMaps as $kiter234 => $viter235) {
                $output->writeListBegin(TType::STRING, count($kiter234));
                foreach ($kiter234 as $iter236) {
                    $xfer += $output->writeString($iter236);
                }
                $output->writeListEnd();
                $xfer += $output->writeString($viter235);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
